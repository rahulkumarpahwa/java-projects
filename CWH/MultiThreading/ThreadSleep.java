package CWH.MultiThreading;

public class ThreadSleep {
    public static void main(String[] args) {
        new FThread("Apple").start();
        new GThread("Mapple").start();

        // Now FThread will get sleep for the 300 milliseconds and will start later
        // after 300 ms gets finished.
    }
}

class FThread extends Thread {
    FThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            try {
                Thread.sleep(300); // sleep : this will make the Thread sleep for 300 milliseconds. We need always
                                   // put it in the try catch block.
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " was interrupted. Due to " + e.getMessage());
            }
            System.out.println("This is the Thread in the FThread class and its name is " + this.getName()
                    + "and  Id : " + this.getId());
            i++;
        }
    }

}

class GThread extends Thread {

    GThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("This is the Thread in the Ghread class and its name is " + this.getName()
                    + " and  Id : " + this.getId());
            i++;
        }
    }

}