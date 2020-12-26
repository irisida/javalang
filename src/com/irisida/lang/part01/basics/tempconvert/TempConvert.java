package com.irisida.lang.part01.basics.tempconvert;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {

        /*
         * create a scanner to accept user input. Also using printf to avoid a newline
         * at the end of the prompt. Remembering to close the scanner and avoid leaks.
         */
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a value in fahrenheit to convert to celsius >  ");

        double fval = scanner.nextFloat();
        scanner.close();

        // call the conversion methods with our input
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
