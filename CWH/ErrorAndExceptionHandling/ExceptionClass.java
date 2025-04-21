package CWH.ErrorAndExceptionHandling;

import java.util.Scanner;

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            if (a < 9) {
                try {
                    throw new MyException();
                } catch (MyException e) {
                    System.out.println("Exception Occur " + e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace(); // tells the line at which error occur.
                    // output : print stack trace :
                        // CWH.ErrorAndExceptionHandling.MyException: null I am getMessage() I am
                        // toString()
                        // at CWH.ErrorAndExceptionHandling.ExceptionClass.main(ExceptionClass.java:12)
                        // at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native
                        // Method)
                        // at
                        // java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
                        // at
                        // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                        // at java.base/java.lang.reflect.Method.invoke(Method.java:566)
                        // at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:404)
                        // at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:179)
                        // at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:119)

                }
            }
        }
    }
}

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString() + " I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage()";
    }
}
