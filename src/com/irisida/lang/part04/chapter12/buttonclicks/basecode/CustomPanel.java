package com.irisida.lang.part04.chapter12.buttonclicks.basecode;

import javax.swing.JPanel;

import java.awt.Color;

public class CustomPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public CustomPanel() {
        super();
        setBackground(Color.WHITE);
    }

    public void changeBGColor(Color color) {
        setBackground(color);
    }
}
