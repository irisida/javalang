package com.irisida.tempconvert;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a value in fahrenheit to convert to celsius >  ");

        double fval = scanner.nextFloat();
        scanner.close();
        System.out.printf("%.1f", getCelsius(fval));
    }

    // accept a fahrenheit value and convert to celsius
    public static double getCelsius(double x) {
        return (x - 32) * 5.0 / 9.0;
    }

    // accept a celsius value and convert to fahrenheit
    public static double getFahrenheit(double x) {
        return (x * (9.0 / 5.0)) + 32;
    }
}
