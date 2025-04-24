package Assignments.Basics;



public class P11 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}


final class FinalClass {
    final int value = 10;

    final void display() {
        System.out.println("Final method in a final class");
    }
}