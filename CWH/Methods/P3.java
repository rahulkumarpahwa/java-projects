package CWH.Methods;

import java.util.Scanner;

public class P3 {

    public static int sum (int n){
        if( n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println(sum(n));
        sc.close();
    }
}
