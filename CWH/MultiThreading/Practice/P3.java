package CWH.MultiThreading.Practice;

public class P3 {
    public static void main(String[] args) {
        KThread kt = new KThread("Apple");
        System.out.println("Kt's current state : " + kt.getState());
        // before starting the state will be NEW.
        kt.start();
        System.out.println("Kt's current state : " + kt.getState());
        // and after the start the state will be RUNNABLE.
    }
}

// we are using here .getState(); method to get the current state of the thread.

class KThread extends Thread {
    KThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println(
                    "Printing details : name: " + this.getName() + " Id: " + this.getId() + " state:  "
                            + this.getState());
            i++;
        }
    }
}
