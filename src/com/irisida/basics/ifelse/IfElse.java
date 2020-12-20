package com.irisida.basics.ifelse;

public class IfElse {

    public static void outputLogger(int i, String message) {
        System.out.printf("%03d - %s%n", i, message);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        /*
         * uses a for loop to count from 100 down to zero while payong fizz buzz.
         */

        for (int i = 100; i > 0; i--) {

            /*
             * the meat of the sandwich here is the use of the if, else if, else construct
             * to make a series of checks
             */

            if (i % a == 0 && i % b == 0) {
                outputLogger(i, "FIZZ BUZZ!");
            } else if (i % a == 0 && i % b != 0) {
                outputLogger(i, "FIZZ!");
            } else if (i % a != 0 && i % b == 0) {
                outputLogger(i, "BUZZ!");
            }

        }
    }

}
