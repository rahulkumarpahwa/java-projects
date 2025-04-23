package Assignments.MultiThreading;

public class P2 {
    public static void main(String[] args) {
        // Create the thread
        ThreadStateDemo thread = new ThreadStateDemo();
        System.out.println("State after thread creation: " + thread.getState()); // NEW

        // Start the thread
        thread.start();
        System.out.println("State after calling start(): " + thread.getState()); // RUNNABLE

        try {
            // Give it time to enter TIMED_WAITING (inside sleep)
            Thread.sleep(200);
            System.out.println("State during Thread.sleep in run(): " + thread.getState()); // TIMED_WAITING

            // Give it time to enter wait()
            Thread.sleep(400);
            System.out.println("State during synchronized-wait in run(): " + thread.getState()); // TIMED_WAITING again

            // Wait for it to finish
            thread.join();
            System.out.println("State after thread termination: " + thread.getState()); // TERMINATED

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadStateDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        try {
            // Sleep for 500ms — TIMED_WAITING
            Thread.sleep(500);

            synchronized (this) {
                // Wait for 200ms — TIMED_WAITING
                wait(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is about to terminate...");
    }
}
