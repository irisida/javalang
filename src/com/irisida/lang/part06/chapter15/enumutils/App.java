package com.irisida.lang.part06.chapter15.enumutils;

public class App {
    public static void main(String[] args) {

        /*
         * Uses the Fruits enum in Fruits.java. There you can see the fruits which
         * belong to the enum are listed in uppercase. Here in the main we can easily
         * traverse the list of values in the enum with a functional for-each type
         * syntax.
         */

        for (Fruits f : Fruits.values()) {
            System.out.printf("pos %d is %s%n", f.ordinal(), f);
        }

        /*
         * test equality.
         */

        Fruits redApple = Fruits.APPLE;
        Fruits greenApple = Fruits.APPLE;
        Fruits orange = Fruits.ORANGE;

        System.out.println(redApple == greenApple); // returns true, even if example implies otherwise

        System.out.println(greenApple == orange); // returns false because much like real life ypu cannot successfully
                                                  // compare apples to oranges
    }
}
