package Assignments.Basics;

public class P3 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using temp): a = " + a + ", b = " + b);

        // Without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);
    }
}