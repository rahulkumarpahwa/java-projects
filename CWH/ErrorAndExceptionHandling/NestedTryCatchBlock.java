package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 10, 16 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Index of Array: ");
        int index = Integer.valueOf(sc.nextLine());
        try {

            try {
                System.out.println("The value at index entereed is : " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("the Index you reequested does not exist");
                System.out.println("Exception in Level 2: " + e);
            }

        } catch (Exception e) {
            System.out.println("Exception in Level 1: " + e);
        }
        sc.close();
    }
}
