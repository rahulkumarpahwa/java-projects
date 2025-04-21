package CWH.MultiThreading;

import java.lang.Thread;

public class MyThreadClass {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();

        // or
        // MyThread1 t1 = new MyThread1();
        // t1.start();
        // MyThread2 t2 = new MyThread2();
        // t2.start();

        /*
         * Analogy : Here the Gun is already loaded with the bullet like the Thread
         * Class (Gun) We extends in our Thread having the Run method (bullet). So, Here we just have to
         * start() the gun to fire as it is already loaded with the bullet (Run method).
         */
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() { // this must be public
        int i = 0;
        while (i < 4000) { // you can put in the while(true) as well but it makes it infinite.
            System.out.println("This is my First Thread");
            System.out.println("I am running First thread");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) { // you can put in the while(true) as well but it makes it infinite.
            System.out.println("This is my Second Thread");
            System.out.println("I am running Second thread");
            i++;
        }
    }
}

// note :
// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Thread.html
// ,java thread methods.