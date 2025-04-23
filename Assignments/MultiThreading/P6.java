package Assignments.MultiThreading;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        // Create a shared control object
        ThreadControl control = new ThreadControl();

        // Create and start the number printing thread
        NumberPrinter printer = new NumberPrinter(control);
        Thread printerThread = new Thread(printer, "NumberPrinter");
        printerThread.start();

        // Handle user input for suspend and resume
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 'S' to suspend the thread, 'R' to resume, or 'Q' to quit:");
        while (true) {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("S")) {
                control.suspendThread();
            } else if (input.equals("R")) {
                control.resumeThread();
            } else if (input.equals("Q")) {
                control.stopThread();
                break;
            }
        }

        // Wait for the thread to finish
        try {
            printerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program terminated.");
    }
}

// Class to control thread suspension and resumption
class ThreadControl {
    private boolean suspended = false;
    private boolean stopped = false;

    // Synchronized method to suspend the thread
    public synchronized void suspendThread() {
        suspended = true;
        System.out.println("Thread suspended.");
    }

    // Synchronized method to resume the thread
    public synchronized void resumeThread() {
        suspended = false;
        notify(); // Notify the waiting thread
        System.out.println("Thread resumed.");
    }

    // Synchronized method to stop the thread
    public synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify(); // Notify the waiting thread to exit
        System.out.println("Thread stopped.");
    }

    // Synchronized method to check if the thread is suspended
    public synchronized void checkSuspended() {
        while (suspended) {
            try {
                wait(); // Wait until the thread is resumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to check if the thread is stopped
    public boolean isStopped() {
        return stopped;
    }
}

// Runnable class to print numbers
class NumberPrinter implements Runnable {
    private final ThreadControl control;

    public NumberPrinter(ThreadControl control) {
        this.control = control;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            synchronized (control) {
                if (control.isStopped()) {
                    System.out.println("Thread exiting...");
                    break;
                }
                control.checkSuspended(); // Check if the thread is suspended
            }

            System.out.println("Number: " + i);

            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
