package com.irisida.lang.part08.chapter20.golversion2;

import javax.swing.SwingUtilities;

import com.irisida.lang.part08.chapter20.golversion2.gui.CustomAppFrame;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomAppFrame("Game of Life"));
    }
}
