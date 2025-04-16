package CWH.OOPS.Intro;

public class P1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "apple", 34);
        e1.PrintDetails();
        Employee e2 = new Employee();
        e2.PrintDetails();
        e2.id = 112;
        e2.name = "kapple";
        e2.salary = 340000;
        e2.PrintDetails();
    }
}

class Employee {
    int id;
    String name;
    float salary;

    Employee() {
        id = -1;
        name = null;
        salary = 0;
    }

    Employee(int id , String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void PrintDetails() {
        System.out.println(id + ": name of the employee : " + name + " & salary : " + salary);
    }
}