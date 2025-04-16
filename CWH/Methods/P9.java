package CWH.Methods;

public class P9 {
    public static void main(String[] args) {
        double n = 0;
        if(args[0] != null){
            n= Double.parseDouble(args[0]);
        } else {
            System.out.println("No Argument passed!");
        }

        System.out.println((n * (9.0/5.0) ) + 32);
    }
}
