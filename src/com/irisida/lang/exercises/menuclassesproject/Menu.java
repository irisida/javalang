package com.irisida.lang.exercises.menuclassesproject;

public class Menu {
    String[] options;

    void display() {
        // display menu header
        System.out.println("Select an option:");

        // list the options provided as menu options
        for (String option : this.options) {
            System.out.printf("  %s%n", option);
        }

        // list the footer and selection prompt
        System.out.printf("%n  Choice >> ");

    }
}
