package CWH.OOPS._3_Constructors;

public class Intro {
    public static void main(String[] args) {
        Employee joker = new Employee(101, "joker", 560000000); // automatically calls the constructor
        joker.printDetails();

        Employee apple = new Employee(); // possible due to constructor overloading.
        apple.printDetails();
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    Employee() { // constructor : Non-Parameterized
        this.name = "apple";
        this.id = 222;
        this.salary = 3400000;
    }

    Employee(int id, String name, int salary) { // parameterized
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("Name od the employee : " +this.name);
        System.out.println("Id of the employee : " + this.id);
        System.out.println("The salary of the employee : " + this.salary);
    }
}
