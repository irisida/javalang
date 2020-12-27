package com.irisida.lang.part06.swingintro.layouts;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CustomFrame("Yo!");
        });

    }
}
