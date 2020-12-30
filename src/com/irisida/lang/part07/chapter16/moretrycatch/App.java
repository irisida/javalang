package com.irisida.lang.part07.chapter16.moretrycatch;

import java.util.Scanner;

public class App {

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean receivedNumber = false;
        int myNumber = 0;

        do {
            System.out.print("Enter a number: ");
            String line = scanner.nextLine();

            try {
                myNumber = Integer.parseInt(line);
                receivedNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        } while (!receivedNumber);

        scanner.close();
        return myNumber;
    }

    public static void main(String[] args) {
        System.out.println("You entered: " + getNumber());
    }
}
