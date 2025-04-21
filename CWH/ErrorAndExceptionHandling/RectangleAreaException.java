package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class RectangleAreaException {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length : ");
            int l = sc.nextInt();
            System.out.println("Enter Breadth : ");
            int b = sc.nextInt();

            if (l < 0 || b < 0) {
                try {
                    throw new NegativeDimesionException("Dimesion can't be negative!");
                } catch (Exception e) {
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                    System.out.println(e); //output same as e.toString();
                }
            } else {
                System.out.println("Area : " + l * b);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
}


class NegativeDimesionException extends Exception{
    NegativeDimesionException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}