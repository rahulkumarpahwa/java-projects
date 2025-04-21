package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class ErrorDemo {
    public static void main(String[] args) {
        // Syntax Error:
        // int a = 30 // no ';' sign
        // b = 30; // no type declaration

        // Logical Error:
        // write a program to print the prime no.s between 1 to 10.
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1); // we have created the logic to print the prime no.s but their is logic error
                                           // as it prints the 3, 5, 7 and 9 and 9 is not a prime no. so their is
                                           // logical error.
        }

        // RunTime Error: (Exception)
        // When we have tested the program but provide it such a input which it can't
        // handle. then input is called as Exception input. Such a input is not handled
        // by the program well and it got failed unfortunately.

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer Part of 1000 divided by K is " + 1000 / k);
        sc.close();
        // the above program works well when we put input k value positive and negative
        // but when k == 0 then the program gives runtime error and exception will occur
        // (IllegalArgumentException). Ihis is due 1000/0 is not defined in the java.

        // we will a lot of exceptions/ runtime errors. we cam handle these errors using
        // mechanism, so that user does get it.
    }
}
