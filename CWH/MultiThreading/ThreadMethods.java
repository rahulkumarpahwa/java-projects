package CWH.MultiThreading;

import java.lang.Thread;

public class ThreadMethods {
    public static void main(String[] args) {
        DThread d1 = new DThread("Apple 1");
        EThread e1 = new EThread("Apple 2"); // we have created two different Thread Classes to show the Join() method of thread works.

        d1.start();
        // now If i want the second thread to start after the completion of the 1st
        // thread  completely then we can use the method .join(); as :
        // d1.join(); // but this will give an exception as if the D1 gets killed/interuppted before
        // it is joined so to handle that we will use the try-catch as:

        try {
            d1.join();
        } catch (Exception e) {
            System.out.println("exception : " + e + "exception msg : " + e.getMessage());
        }
        // this try-catch is used to handle the errors and exceptions.
        e1.start();
    }
}

class DThread extends Thread {
    DThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("This is the Thread in the DThread class and its name is " + this.getName()
                    + "and  Id : " + this.getId());
            i++;
        }
    }

}

class EThread extends Thread{

    EThread(String name){
        super(name);
    }
@Override
public void run() {
    int i = 0;
        while (i < 400) {
            System.out.println("This is the Thread in the EThread class and its name is " + this.getName()
                    + "and  Id : " + this.getId());
            i++;
        }
}

}

// Note: learn more at https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html