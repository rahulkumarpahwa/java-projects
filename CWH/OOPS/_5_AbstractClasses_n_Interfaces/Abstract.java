package CWH.OOPS._5_AbstractClasses_n_Interfaces;

public class Abstract {
    public static void main(String[] args) {
        // Base b = new Base(); --> error (abstract class)
        Derived d = new Derived();
        d.greet();
        d.sayHello();

        // Derived2 d2 = new Derived2(); --> error (abstract class)



        // It is possible to create reference of the abstract class to the object of
        // concrete class. means we can use the abstract class reference which has
        // initiated with the derived class objects in it.
        Base b2 = new Derived();
        b2.greet();
        b2.sayHello();
        // b2.ask(); // we can't refer to the methods which are not derived in the Derived
        // class from the base class.

    }
}

abstract class Base {
    Base() {
        System.out.println("the Constructor of base class");
    }

    public void sayHello() {
        System.out.println("Hello user!");
    }

    abstract public void greet();
}

class Derived extends Base {

    @Override
    public void greet() {
        System.out.println("hello from the derived class");
    }

    public void ask() {
        System.out.println("Hey! What you are doing?");
    }

}

abstract class Derived2 extends Base {
    @Override
    public void greet() {
        System.out.println("I am the derived class Two");
    }

}