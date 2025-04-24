package Assignments.Basics.Extra;

import java.util.Scanner;

// Custom exception for invalid salary
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private String employeeName;
    private String employeeID;
    private double salary;
    
    public Employee(String employeeName, String employeeID, double salary) throws InvalidSalaryException {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: ₹" + salary);
    }
}

// Main class for the payroll system
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("EMPLOYEE PAYROLL SYSTEM");
        System.out.println("======================");
        
        try {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter employee ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Enter salary amount: ");
            double salary = scanner.nextDouble();
            
            // Try to create employee
            Employee employee = new Employee(name, id, salary);
            employee.displayDetails();
            
        } catch (InvalidSalaryException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nPayroll processing complete");
            scanner.close();
        }
    }
}
