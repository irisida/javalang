package com.irisida.lang.part04.chapter12.buttonclicks.basecode;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new CustomFrame("Yo!"));

    }
}
