package Assignments.MultiThreading;

public class P3 {
    public static void main(String[] args) {
        // Create threads with different priorities
        Thread highPriorityThread = new Thread(new PriorityTask(), "HighPriorityThread");
        Thread mediumPriorityThread = new Thread(new PriorityTask(), "MediumPriorityThread");
        Thread lowPriorityThread = new Thread(new PriorityTask(), "LowPriorityThread");

        // Set thread priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Priority 10
        mediumPriorityThread.setPriority(Thread.NORM_PRIORITY); // Priority 5
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Priority 1

        // Start threads
        highPriorityThread.start();
        mediumPriorityThread.start();
        lowPriorityThread.start();
    }
}

// Task to be executed by threads
class PriorityTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
