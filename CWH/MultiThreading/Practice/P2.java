package CWH.MultiThreading.Practice;

public class P2 {
    public static void main(String[] args) {
        IThread it = new IThread(); // this contains the run method act a bullet.
        Thread t = new Thread(it, "Apple"); // this will start the run method act as gun.

        IThread it2 = new IThread();
        Thread t2 = new Thread(it2, "Mapple");

        IThread it3 = new IThread();
        Thread t3 = new Thread(it3, "Kapple");

        t.setPriority(Thread.MAX_PRIORITY); // we can pass the int value here as well. the default value of the priority is 5.
        t2.setPriority(Thread.MIN_PRIORITY); // we can pass the int value here as well. the default value of the priority is 5.
        System.out.println("priority of the t3 :" + t3.getPriority()); // 5
        t3.setPriority(t2.getPriority());
        System.out.println("priority of the t3 :" + t3.getPriority()); // 1

        t.start();
        t2.start();
        t3.start();

    }
}

class IThread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Printing Details");
            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
            i++;
        }
    }
}