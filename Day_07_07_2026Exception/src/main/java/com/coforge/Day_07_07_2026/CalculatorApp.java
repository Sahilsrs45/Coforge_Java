package com.coforge.Day_07_07_2026;

public class CalculatorApp {

    public static void main(String[] args) {

        CalculatorInterface ci = (a, b) -> a / b;

        System.out.println("Division = " + ci.div(20, 5));
        
        
     // Addition
//      CalculatorInterface ci = (a, b) -> a + b;
//      System.out.println("Addition = " + ci.add(10, 5));

      // Subtraction
//      CalculatorInterface ci = (a, b) -> a - b;
//      System.out.println("Subtraction = " + ci.sub(10, 5));

      // Multiplication
//      CalculatorInterface ci = (a, b) -> a * b;
//      System.out.println("Multiplication = " + ci.mul(10, 5));

      // Division

//        CalculatorInterface ci = new CalculatorApp();
//
//        System.out.println(ci.add(10, 5));
//
//        System.out.println(ci.sub(10, 5));
//
//        System.out.println(ci.mul(10, 5));
//
//        System.out.println(ci.div(20, 5));
    }

//    @Override
//    public int add(int a, int b) {
//        return a + b;
//    }

//    @Override
//    public int sub(int a, int b) {
//        return a - b;
//    }

//    @Override
//    public int mul(int a, int b) {
//        return a * b;
//    }

//    @Override
//    public int div(int a, int b) {
//        return a / b;
//    }

}