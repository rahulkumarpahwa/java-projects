package CWH.Methods;

public class P8 {
    public static void pattern(int n) {
        if (n == 0) {
            return;
        }
        pattern(n-1);
        for (int i = 1; i <=n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (args[0] != null) {
            pattern(Integer.parseInt(args[0]));
        }

    }
}
