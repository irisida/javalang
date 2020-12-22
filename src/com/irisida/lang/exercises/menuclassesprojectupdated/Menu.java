package com.irisida.lang.exercises.menuclassesprojectupdated;

public class Menu {
    String[] options;

    String get() {

        // display menu header
        String menuString = "Select an option: \n";

        // list the options provided as menu options
        for (String option : this.options) {
            menuString += "  " + option + "\n";
        }

        menuString += "\n  Choice >> ";

        return menuString;
    }
}
