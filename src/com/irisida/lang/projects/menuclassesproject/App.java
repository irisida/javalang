package com.irisida.lang.projects.menuclassesproject;

public class App {
    public static void main(String[] args) {

        // create an instance of our menu class
        Menu menu = new Menu();

        // create an array of strings for our menu options and assign that to the
        // options of the menu class
        String[] menuOptions = new String[] { "1. Add new item", "2. View database", "3. Delete item", "q. Exit" };
        menu.options = menuOptions;

        // call the public method
        menu.display();
    }
}
