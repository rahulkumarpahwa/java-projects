package CWH.Methods;

public class P6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+= Integer.valueOf(args[i]); // either use Integer.parseInt(args[i]);
        }
        System.out.println(sum/args.length);
    }
}
