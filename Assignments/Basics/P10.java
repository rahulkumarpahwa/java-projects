package Assignments.Basics;

public class P10 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

class Parent {
    public void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        super.display(); // Call parent method
        System.out.println("Child class method");
    }
}