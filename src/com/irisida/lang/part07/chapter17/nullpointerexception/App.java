package com.irisida.lang.part07.chapter17.nullpointerexception;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner; // remains uninitialised.

        // uncomment line 11 to see the NullPointerException, currently commented out to
        // remove errors from the repo
        // String input = scanner.nextLine(); // therefore triggers a
        // NullPointerException
        scanner = new Scanner(System.in); // can be removed
        String msg = scanner.nextLine(); // can be removed
        scanner.close(); // can be removed
        System.out.println("placeholder code to avoid linting errors on repo build: " + msg); // can be removed

    }
}
