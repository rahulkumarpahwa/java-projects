package CWH.ErrorAndExceptionHandling;

public class WhileWithFinallyBlock {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally and the value of b is " + b); // so the finally will even excute when
                                                                               // we use the break statement even.
            }
            b--;
        }

    }
}
