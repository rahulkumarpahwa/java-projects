package Assignments.Basics;

import Assignments.Basics.mypackage.Calculator;

public class P12 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}
