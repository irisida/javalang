package com.irisida.lang.exercises.changedetection;

import java.util.Scanner;

public class ChangeDetection {

    public static void doPrompt(String prompt) {
        System.out.printf("%s", prompt);
    }

    public static void main(String[] args) {
        final String OLD_PWD = "nonsense";

        Scanner scanner = new Scanner(System.in);
        doPrompt("Enter current password: ");
        String pwd0 = scanner.nextLine();

        doPrompt("Enter new password: ");
        String pwd1 = scanner.nextLine();

        doPrompt("Re-enter the new password: ");
        String pwd2 = scanner.nextLine();
        scanner.close();

        if (pwd0.equals(OLD_PWD)) {
            if (pwd1.equals(pwd0)) {
                System.out.println("Password already in use");
            }
            if (pwd1.equals(pwd2)) {
                System.out.println("Password successfully changed");
            } else {
                System.out.println("passwords did not match.");
            }
        }

    }
}
