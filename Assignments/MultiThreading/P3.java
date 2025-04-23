package Assignments.MultiThreading;

// Main class
public class P3 {
    public static void main(String[] args) {
        // Using Runnable
        System.out.println("Using Runnable:");
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new RunnableTask(), "Runnable-Thread-" + i);
            thread.start();
        }

        // Using Thread
        System.out.println("\nUsing Thread:");
        for (int i = 1; i <= 3; i++) {
            ThreadTask threadTask = new ThreadTask("Thread-Task-" + i);
            threadTask.start();
        }
    }
}

// Class implementing Runnable
class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Class extending Thread
class ThreadTask extends Thread {
    public ThreadTask(String name) {
        super(name); // Set thread name
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
