package CWH.OOPS._5_AbstractClasses_n_Interfaces.Practice;

public class P2 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.bite();
        h1.sleep();
        h1.eat();
        h1.jump();

        // polymorphism : Dynamic Binding
        Monkey m = new Human(); // storing the reference of the Human Object in the monkey so that It act like
                                // the monkey.
        // only the methods common to the reference can be used.
        m.bite();
        m.jump();
        // m.sleep(); --> not allowed
        // m.eat(); --> not allowed

        // polymorphism: interfaces
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();
        // b.bite(); --> not allowed
    }
}

interface BasicAnimal {
    public void sleep();

    public void eat();
}

class Monkey {
    public void jump() {
        System.out.println("The MonKey can Jump.");
    }

    public void bite() {
        System.out.println("The Monkey Can Bite.");

    }
}

class Human extends Monkey implements BasicAnimal {

    @Override
    public void jump() {
        super.jump(); // calling the super class
        System.out.println("Human Jump");
    }

    @Override
    public void bite() {
        super.bite(); // calling the super class
        System.out.println("Human Bites");
    }

    @Override
    public void eat() {
        System.out.println("Human Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human Sleep");
    }

}
