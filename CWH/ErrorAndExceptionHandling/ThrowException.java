package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num == 0) {
                try {
                    throw new ArithmeticException("Divide by Zero");
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("the division is " + 100 / num);
            }
        } catch (Exception e) {
            System.out.println("Exception Occur " + e);
        }
    }
}
