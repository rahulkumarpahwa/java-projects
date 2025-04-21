package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class CustomExceptionWithThrows {

    public static double area(int radius) throws NegativeRadius{
        if(radius < 0){
            throw new NegativeRadius(); // we don't need to handle here the exception as the function itself throws the Exception and we will handle it in the main.
        }
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        int radius;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius : ");
            radius = sc.nextInt();
            try {
                System.out.println("the area of the circle is " + area(radius));
            } catch (NegativeRadius e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }

        } catch( Exception e){
            System.out.println(e);
        }

    }
}

class NegativeRadius extends Exception {
    @Override
    public String toString() {
        return "The radius can't be negative!";
    }

    @Override
    public String getMessage() {
        return "Make sure to enter the proper radius!";
    }
}