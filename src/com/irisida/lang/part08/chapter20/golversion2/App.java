package com.irisida.lang.part08.chapter19.golversion1;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomAppFrame("Game of Life"));
    }
}
