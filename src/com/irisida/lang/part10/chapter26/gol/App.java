package com.irisida.lang.part10.chapter26.gol;

import javax.swing.SwingUtilities;

import com.irisida.lang.part10.chapter26.gol.gui.CustomAppFrame;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomAppFrame("Game of Life"));
    }
}
