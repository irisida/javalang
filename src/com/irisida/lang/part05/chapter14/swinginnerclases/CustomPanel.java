package com.irisida.lang.part05.chapter14.swinginnerclases;

import javax.swing.JPanel;

import java.awt.Color;

public class CustomPanel extends JPanel implements ColorChangeListener {
    private static final long serialVersionUID = 1L;

    public CustomPanel() {
        super();
        setBackground(Color.WHITE);
    }

    @Override
    public void changeColor(Color color) {
        setBackground(color);
    }
}
