package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 10, 16 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Index of Array: ");
        int index = Integer.valueOf(sc.nextLine());

        System.out.println("Enter the number with which you want to divide :");
        int num = sc.nextInt();

        try {
            System.out.println("The value of index entereed is : " + index);
            System.out.println("The division of array value with the num is " + arr[index] / num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Exception Occurred. Exception : " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Exception Occurred. Exception : " + e);
        } catch (Exception e) {
            System.out.println("Some Other Exception Occurred. Exception : " + e);
        }

        sc.close();
    }
}
