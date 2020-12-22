package com.irisida.lang.exercises.windowclass;

public class App {
    public static void main(String[] args) {

        // declare a new window class
        Window appWindow = new Window();

        // set the maximised property that controls other prop values
        appWindow.setMaximised(true);
        System.out.println("Height       : " + appWindow.getCurrentHeight());
        System.out.println("Width        : " + appWindow.getCurrentWidth());
        System.out.println("Is maximised : " + appWindow.isMaximised());
        System.out.println(appWindow.toString());
        System.out.println(appWindow); // calls toString() by default.

        // reset the maximised to show the other possible case
        appWindow.setMaximised(false);
        System.out.println("Height       : " + appWindow.getCurrentHeight());
        System.out.println("Width        : " + appWindow.getCurrentWidth());
        System.out.println("Is maximised : " + appWindow.isMaximised());
        System.out.println(appWindow.toString());
        System.out.println(appWindow); // calls toString() by default.

    }
}
