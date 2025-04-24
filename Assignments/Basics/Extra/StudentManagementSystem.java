package Assignments.Basics.Extra;

import Assignments.Basics.Extra.studentdata.Student;
import Assignments.Basics.Extra.studentoperations.Result;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create multiple student objects
        Student student1 = new Student("Rahul Kumar", 101, 92.5);
        Student student2 = new Student("Priya Sharma", 102, 85.0);
        Student student3 = new Student("Amit Singh", 103, 72.5);
        Student student4 = new Student("Neha Patel", 104, 65.0);

        // Create a Result object to calculate grades
        Result result = new Result();

        // Display details and grades for each student
        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("=========================");

        result.displayResult(student1);
        result.displayResult(student2);
        result.displayResult(student3);
        result.displayResult(student4);
    }
}