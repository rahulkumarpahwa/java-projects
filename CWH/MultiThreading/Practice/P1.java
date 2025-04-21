package CWH.MultiThreading.Practice;

import java.lang.Thread;

public class P1 {

    public static void main(String[] args) {
        HThread it = new HThread("Good Morining!");
        HThread it2 = new HThread("Welcome!");
        it.start();
        it2.start();

    }
}

class HThread extends Thread {

    HThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (this.getName().equals("Welcome!")) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("Interruption error " + e);
                }
            }
            System.out.println("Printing Details");
            System.out.println(this.getId() + " " + this.getName());
        }
    }
}