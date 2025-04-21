package CWH.ErrorAndExceptionHandling.Practice;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3, 5 };

        int tries = 0;
        int index;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                if (tries >= 5) {
                    try {
                        throw new Exception("Error");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
    
                }
                System.out.println("Enter the index you want to access : ");
                index = sc.nextInt();
                try {
                    System.out.println("The value at index is " + arr[index]);
                    break;
                } catch (Exception e) {
                    tries++;
                    System.out.println("Exception : " + e);
                    System.out.println("Try Again! ");
                }
            }
            
        } 

    }
}
