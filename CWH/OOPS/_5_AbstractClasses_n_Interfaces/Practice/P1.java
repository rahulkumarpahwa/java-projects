package CWH.OOPS._5_AbstractClasses_n_Interfaces.Practice;

public class P1 {
    public static void main(String[] args) {
        FountainPen f1 = new FountainPen();
        f1.changeNib();
        f1.refill();
        f1.write();

    }
}

abstract class Pen {
    abstract public void write();

    abstract public void refill();
}

class FountainPen extends Pen {
    @Override
    public void write() {
        System.out.println("Writing with fountain Pen");

    }

    @Override
    public void refill() {
        System.out.println("Refilling the fountain Pen");

    }

    void changeNib() {
        System.out.println("Changing the nib of the fountain Pen");

    }

}