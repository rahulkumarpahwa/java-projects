package Assignments.Basics;

public class P8 {
    public static void main(String[] args) {
        Student student = new Student("John", 101, 95.5);
        student.displayDetails();
    }
}

class Student {
    String name;
    int rollNo;
    double marks;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}