package CWH.MultiThreading;

import java.lang.Runnable;

public class RunnableConstructor {
    public static void main(String[] args) {
        BThread t = new BThread(); // t acts as a bullet, which we will load in the Thread class
        Thread nt = new Thread(t, "Apple"); // passing the name along with the thread. nt act as the gun which is loaded
                                            // with bullet (t here) and name.
        nt.start(); // starting the thread.
        System.out.println("the id of the thread is " + nt.getId());
        System.out.println("the name of thread is " + nt.getName());

    }
}

class BThread implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("this is thread in Class BThread.");
            i++;
        }
    }

}

// Thread Group : https://docs.oracle.com/javase/8/docs/api/java/lang/ThreadGroup.html eplore yourself. 
// It is used to combine the threats of the same type. You can start and stop the group anytime you want. Learn it yourself.