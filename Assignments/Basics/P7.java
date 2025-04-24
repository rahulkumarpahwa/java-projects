package Assignments.Basics;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Check Even/Odd");
            System.out.println("2. Find Factorial");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++) fact *= i;
                    System.out.println("Factorial: " + fact);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}