package com.irisida.lang.methods.calculator;

public class App {
    public static void main(String[] args) {

        // create an instance of the class
        Calculator calc = new Calculator();

        System.out.println("square   :" + calc.square(5));
        System.out.println("add      :" + calc.add(5, 16));
        System.out.println("subtract :" + calc.subtract(21, 18));
        System.out.println("modulo   :" + calc.modulo(5, 2));
        System.out.println("divide   :" + calc.divide(5, 2));

    }
}
