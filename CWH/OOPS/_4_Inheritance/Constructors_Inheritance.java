package CWH.OOPS._4_Inheritance;

public class Constructors_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.PrintDetails();

        Derived d2 = new Derived(2, 3);
        d2.PrintDetails();

        Base b = new Base();
        b.PrintDetails();
    }

}

class Base {
    int x;

    Base() {
        x = 0;
    }

    Base(int x) {
        this.x = x;
    }

    void PrintDetails() {
        System.out.println("the value of the x are : " + x);
    }
}

class Derived extends Base {
    int y;

    Derived() {
        super();
        y = 0;
    }

    Derived(int x, int y) {
        super(x);
        this.y = y;
    }

    void PrintDetails() {
        System.out.println("the values of x and y are : " + x + "," + y);
    }
}
