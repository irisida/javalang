package com.irisida.lang.part05.chapter13.hashcodethis;

public class App {
    public static void main(String[] args) {

        /*
         * The demo shows that we can access the hashcode value (hexadecimal) in the
         * default implementation of toString that we get for any object we create. In
         * the second example we use the printf to allow us to define that it should
         * show as a hex format as the decimal format is the default option in the
         * println function.
         */

        Fox fox = new Fox();
        System.out.printf("The hex of the hashcode is: %h%n", fox.hashCode()); // show the hex of the hashcode.

        Fox f1 = new Fox(); // constructor has output
        System.out.println("Console output: " + f1);
        Fox f2 = new Fox(); // constructor has output
        System.out.println("Console output: " + f2);
    }
}
