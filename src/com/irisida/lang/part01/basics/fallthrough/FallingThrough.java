package com.irisida.lang.part01.basics.fallthrough;

import java.util.Scanner;

public class FallingThrough {
    public static void main(String[] args) {
        System.out.print("Proceed? [Y]/n : ");

        /*
         * open a scanner and accept a user input. Uses nextline as the nextline also
         * handles the carriage return and line feed as well as the characters passed,
         * even if only one character.
         */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        /*
         * removing the breaks to demonstrate some unexpected or unwanted behaviour
         * where the program falls through to the next case. We see here it will fall
         * through from the y case to into the n case, from there it will the fall
         * through to the default case. This opens up some interesting and creative
         * options and possibilities but shoud be used with caution and as always,
         * simplicity is king.
         */

        switch (input.toLowerCase()) {
            case "y":
                System.out.println("inside the Y/y switch case ");
                // break;
            case "n":
                System.out.println("inside the N/n switch case");
                // break;
            default:
                System.out.println("unrecognised option was entered: " + input);
                break;
        }

    }

}
