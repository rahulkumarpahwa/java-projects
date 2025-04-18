package CWH.OOPS._4_Inheritance.Practice;

public class P3 {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        System.out.println("The class of the d2  :" + d2.getClass());
    }
}

class Base {
    Base() {
        System.out.println("the base constructor");
    }
}

class Derived1 extends Base {
    Derived1() {
        System.out.println("the derived one constructor");
    }
}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("the derived two Constructor");
    }
}