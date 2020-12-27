package com.irisida.lang.part02.chapter04.simplearrays;

public class SimpleArrays {
    public static void main(String[] args) {

        /*
         * Declare and populate two arrays of ints with the format that adheres to a
         * euromillions ticket, five numbers (1-50) and two bonus numbers (1-12). We can
         * also see the scoping of variables based on the use/reuse of the name index
         * for the loop controller.
         */
        int[] numbers = { 3, 8, 19, 25, 40 };
        int[] bonus = { 3, 12 };

        for (int index = 0; index < numbers.length; index++) {
            System.out.printf("Ball number %02d is %d%n", index + 1, numbers[index]);
        }

        for (int index = 0; index < bonus.length; index++) {
            System.out.printf("Bonus Ball number %02d is %d%n", index + 1, numbers[index]);
        }
    }
}
