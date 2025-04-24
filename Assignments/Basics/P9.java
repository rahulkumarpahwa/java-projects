package Assignments.Basics;

public class P9 {
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Two Integers: " + a + ", " + b);
    }

    public static void main(String[] args) {
        P9 obj = new P9();
        obj.display(10);
        obj.display(10.5);
        obj.display(10, 20);
    }
}