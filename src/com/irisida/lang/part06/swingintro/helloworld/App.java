package com.irisida.lang.part06.swingintro.helloworld;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CustomFrame("Hello, World");
        });

    }
}
