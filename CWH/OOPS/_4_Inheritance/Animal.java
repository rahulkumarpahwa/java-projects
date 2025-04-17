package CWH.OOPS._4_Inheritance;

public class Animal {
    String name;

    public void Sounds() {
        System.out.println("Animal Makes Sound!");
    }

    public void Walk() {
        System.out.println("Animal can walk!");
    }

    public static void main(String[] args) {
            Dog scooby = new Dog();
            scooby.DogSounds();
            scooby.Walk();
            scooby.Sounds();
            scooby.name = "Scooby";
            scooby.PrintDetails();
    }
}

class Dog extends Animal {
    public void DogSounds() {
        System.out.println("The Dog Bark!");
    }
    public void PrintDetails(){
        System.out.println("The name of the Dog is " + this.name);
    }
}
