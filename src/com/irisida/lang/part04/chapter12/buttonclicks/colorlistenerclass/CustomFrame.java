package com.irisida.lang.part04.chapter12.buttonclicks.colorlistenerclass;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class CustomFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public CustomFrame() {
        this("No title given");
    }

    public CustomFrame(String windowTitle) {
        super(windowTitle);

        final CustomPanel mainPanel = new CustomPanel();

        mainPanel.changeBGColor(Color.PINK);

        setLayout(new BorderLayout());

        add(new ToolBar(mainPanel), BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(CustomFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
