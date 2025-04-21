package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class QuickQuiz {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 10, 16 };
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter The Index of Array: ");
            int index = Integer.valueOf(sc.nextLine());
            try {
                System.out.println("the value at the index is " + arr[index]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This index does not exist.");
                System.out.println("This is level one  Exception " + e);
            }
        }
        System.out.println("Thanks for using this program");

        sc.close();
    }
}

// here what we are doing is we will try to get the value at the index and if it
// does not exist then we will give exception and once our program does not give
// any exception then we can come out of the loop.