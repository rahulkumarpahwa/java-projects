package CWH.ErrorAndExceptionHandling;

public class ThrowVsThrows {

    public static int divide(int a, int b) throws ArithmeticException { // now this function can throw an Arithematic
                                                                        // Exception
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int res = divide(23, 0); // we have passed zero to get the exception and when no exception is found then next statement will execute.
            System.out.println("the Division of two numberes is " + res);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
}

// the throws keyword is used with the function and in case the function throws
// an exception we can handle in main with try-catch statement. So, we can
// predefined in case a method can throw the error with the help of THROWS
// keyword. Hence, the responsibility of handling error is transferred to the
// main function from the defined function.
