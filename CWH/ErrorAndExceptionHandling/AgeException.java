package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age : ");
            x = sc.nextInt();
            if (x > 125) {
                try {
                    throw new AgeExp();
                } catch (AgeExp e) {
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                    System.out.println(e);
                }
            } else {
                System.out.println("the age is " + x);
            }

        } catch (Exception e){
            System.out.println("Exception " + e);
        }
    }
}

class AgeExp extends Exception {
    @Override
    public String toString() {
        return "Age can't be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure the proper value of age is entered";
    }
}
