package CWH.MultiThreading.Practice;

public class P4 {
    public static void main(String[] args) {
        JThread jt = new JThread("Apple");
        jt.start();
        System.out.println("The Reference of the current thread : " + Thread.currentThread()
                + " and the state of this thread is " + Thread.currentThread().getState());
    }
}

// to get the reference of the current thread we can use the
// Thread.currentThread();

class JThread extends Thread {

    JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Printing Details");
            System.out.println(this.getId() + " " + this.getName() + " Current Referenece " + Thread.currentThread()
                    + " and Current state of This Thread is " + Thread.currentThread().getState());
            i++;
        }
    }
}
