package Assignments.MultiThreading;

public class P1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();

        Thread tt1 = new Thread(t1);
        tt1.start();
        Thread tt2 = new Thread(t2);
        tt2.start();
        Thread tt3 = new Thread(t3);
        tt3.start();
        Thread tt4 = new Thread(t4);
        tt4.start();
        Thread tt5 = new Thread(t5);
        tt5.start();

    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is Thread One with id " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception in sleep : " + e);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is Thread Two with id " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception in sleep : " + e);
        }
    }
}

class Thread3 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is Thread Three with id " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception in sleep : " + e);
        }
    }
}

class Thread4 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is Thread Four with id " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception in sleep : " + e);
        }
    }
}

class Thread5 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is Thread Five with id " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception in sleep : " + e);
        }
    }
}
