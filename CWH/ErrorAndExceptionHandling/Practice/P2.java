package CWH.ErrorAndExceptionHandling.Practice;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number");
            x = sc.nextInt();
            if (x == 0) {
                try {
                    throw new ArithmeticException("HAHA");
                } catch (ArithmeticException e) {
                    System.out.println(e.toString());
                }
            } else if (x < 0) {
                try {
                    throw new IllegalArgumentException("HEHE");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.toString());
                } 

            } else {
                System.out.println("Division is " + 1000/ x);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
