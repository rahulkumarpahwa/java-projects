package Assignments.Basics;

public class P13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.play();
    }
}

interface Animal {
    void makeSound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }
}