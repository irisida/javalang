package com.irisida.lang.part04.chapter11.swingintro.helloworld;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CustomFrame("Hello, World");
        });

    }
}
