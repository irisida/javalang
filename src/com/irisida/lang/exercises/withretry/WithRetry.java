package com.irisida.lang.exercises.withretry;

import java.util.Scanner;

public class WithRetry {

    public static void doPrompt(String prompt) {
        System.out.printf("%s", prompt);
    }

    public static void main(String[] args) {
        final String OLD_PWD = "password";

        // setup the scanner
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean matched = false;
        String pwd0;

        while (count < 3) {
            doPrompt("Enter current password: ");
            pwd0 = scanner.nextLine();

            if (pwd0.equals(OLD_PWD)) {
                matched = true;
                break;
            }
            count++;
        }

        if (matched) {
            doPrompt("Enter new password: ");
            String pwd1 = scanner.nextLine();

            doPrompt("Re-enter the new password: ");
            String pwd2 = scanner.nextLine();
            scanner.close();

            if (pwd1.equals(OLD_PWD)) {
                System.out.println("Password already in use");
            }
            if (pwd1.equals(pwd2)) {
                System.out.println("Password successfully changed");
            } else {
                System.out.println("passwords did not match.");
            }
        } else {
            System.out.println("Operation terminated. Password entered was incorrect.");
        }
    }
}
