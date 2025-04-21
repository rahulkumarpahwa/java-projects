package CWH.MultiThreading;

import java.lang.Thread;

public class ThreadPriorities {
    public static void main(String[] args) {
        CThread ct1 = new CThread("Apple 1"); // passing the name to the thread.
        CThread ct2 = new CThread("Apple 2"); // passing the name to the thread.
        CThread ct3 = new CThread("Apple 3"); // passing the name to the thread.
        CThread ct4 = new CThread("Apple 4"); // passing the name to the thread.
        CThread ct5 = new CThread("Apple 5"); // passing the name to the thread.

        ct1.setPriority(Thread.MAX_PRIORITY);
        ct2.setPriority(Thread.MIN_PRIORITY);
        ct3.setPriority(Thread.MIN_PRIORITY);
        ct4.setPriority(Thread.MIN_PRIORITY);
        ct5.setPriority(Thread.MIN_PRIORITY);

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();

    }
}

// the one with MAX_PRIORITY will run max no. of the time and other with min
// will get run ess no. of times. Although it depends upon the OS as well. (read
// the note)

// Note : the priorities set by the java using threads is not thatr realiable as
// it is also set up the OS and highly depend upon on the OS that what to
// execute. which means if the CPU is avialable then it can provided to the low
// level priority thread as well.

class CThread extends Thread {

    CThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am the thread in the Cthread Class object " + this.getName() + this.getId()); // this is the object
                                                                                                 // of the thread class
                                                                                                 // and we take the name
                                                                                                 // of the thread we got
                                                                                                 // there and also the the id of the thread object.
            i++;
        }

    }
}
