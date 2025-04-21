package CWH.MultiThreading;

import java.lang.Runnable;

public class ThreadUsingRunningInterface {

    public static void main(String[] args) {
        MyThreadRunnable1 tr1 = new MyThreadRunnable1();
        Thread t1 = new Thread(tr1);

        MyThreadRunnable2 tr2 = new MyThreadRunnable2();
        Thread t2 = new Thread(tr2);

        t1.start();
        t2.start();

        /*
         * Analogy : Like the Bullet can't be fired without the gun, similarly here the
         * bullet is run method in the your thread with the help of Runnable created
         * while the Thread Class is Gun and when we load the bullet in the Gun then
         * only we can start().
         * 
         * ThreadRunnable1 bullet1= new MyThreadRunnable1();
         * Thread gun1 = new Thread(bullet1);
         * 
         * MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
         * Thread gun2 = new Thread(bullet2);
         * 
         * gun1.start();
         * gun2.start();
         * 
         */
    }
}

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() { // must be public
        int i = 0;
        while (i < 4000) {
            System.out.println("I am thread NO. 1 that Implements Runnable.");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am Thread No. 2 That Implements Runnable.");
        }
    }
}