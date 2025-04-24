package Assignments.Basics.Extra.studentoperations;

// Ensure the correct package path for Student class
import Assignments.Basics.Extra.studentdata.Student;

public class Result {
    public static String calculateGrade(Student student) {
        double marks = student.getMarks();

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public void displayResult(Student student) {
        student.displayDetails();
        System.out.println("Grade: " + calculateGrade(student));
        System.out.println("-----------------------");
    }
}
