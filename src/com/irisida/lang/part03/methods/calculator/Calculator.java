package com.irisida.lang.part03.methods.calculator;

public class Calculator {
    public int square(int x) {
        return x * x;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        // naive division
        return x / y;
    }

    public int modulo(int x, int y) {
        return x % y;
    }
}
