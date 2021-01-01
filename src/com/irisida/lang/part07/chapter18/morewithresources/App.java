package com.irisida.lang.part07.chapter18.morewithresources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*
         * here we're making another demo of the TryWithResources syntax is use. We're
         * creating a new scanner to accept an int and throwing the exception when we
         * have bad input, scanner has a close() method and therefore adheres to the
         * autoCloseable interface.
         */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Input error. A number is the expected input.");
        }
    }
}
