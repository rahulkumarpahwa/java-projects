package CWH.MultiThreading;

import java.lang.Thread;

public class Constructors {
    public static void main(String[] args) {
        AThread t = new AThread("Apple"); // passing the name of the Thread.
        t.start();
        System.out.println("the ID of the Thread is " + t.getId()); // method to get the ID
        System.out.println("the name of the thread is " + t.getName()); // method to get the name of the thread.
    }
}

class AThread extends Thread {
    AThread(String name) { // parameterised constructor taking the name, which can be passed to the Thread
                           // Constructor
        super(name); // calling the Thread Class Constructor along with passing the name.
    }
    @Override
    public void run() {
        int i = 0;
        while(i<10){
            System.out.println("I am Thread of the AThread Class.");
            i++;
        }
    }


}