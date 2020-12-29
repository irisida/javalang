package com.irisida.lang.part05.chapter14.swingandlambda;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomFrame("Yo!"));
    }
}
