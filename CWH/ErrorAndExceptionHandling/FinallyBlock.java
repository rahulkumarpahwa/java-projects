package CWH.ErrorAndExceptionHandling;

public class FinallyBlock {
    public static int greet() {
        try {
            int a = 5;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally { // this will execute in every case. like the above statement is dividing the a
                    // by b and no one is zero and this is return statement but still the finally
                    // block executes.
                    // so finally block even run after the return statement.
                    // also when we want to clean up the resources then we also can use the finally
                    // block to do that, as it will always execute.
            System.out.println("this is the end of the function!");
            System.out.println("Cleaning Up Resources.");
        }
        return 0; // in case the control does not go in th try.
    }

    public static void main(String[] args) {
        System.out.println(greet());

        // note: that we can use the try with finally block without using the catch
        // statement. In such case when the try does not work then finally will directly
        // execute. but as we have n't handled the exception so we will get the error as well. and if not exception, still the finally will execute.
        try {
            System.out.println(23 / 0);
        } finally {
            System.out.println("the finally block and the end of execute and I execute everytime!");
        }
    }
}
