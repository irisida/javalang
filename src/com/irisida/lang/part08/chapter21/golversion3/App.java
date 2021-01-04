package com.irisida.lang.part08.chapter21.golversion3;

import javax.swing.SwingUtilities;

import com.irisida.lang.part08.chapter21.golversion3.gui.CustomAppFrame;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomAppFrame("Game of Life"));
    }
}
