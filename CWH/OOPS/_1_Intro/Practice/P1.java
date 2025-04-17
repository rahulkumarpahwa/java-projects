package CWH.OOPS._1_Intro.Practice;

public class P1 {
    public static void main(String[] args) {
        Employee varry = new Employee();
        System.out.println(varry.getName());
        varry.printDetails();
        Employee harry = new Employee(2222, "harry", 333333333);
        System.out.println(harry.getClass());
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        harry.setName("apple");
        harry.printDetails(); // new details will be printed.

    }
}

class Employee {
    int id = 0;
    String name = "start"; // default value
    int salary = 0;

    // default values of the instance variables are null for String and for int, float, double and long it is 0. 

    Employee() {

    }

    Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.salary = sal;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    int getSalary() {
        return this.salary;
    }

    public void printDetails() {
        System.out.println("id : " + this.id);
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
    }
}