package com.irisida.lang.part05.chapter14.swinginnerclases;

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
        final ToolBar toolBar = new ToolBar();
        toolBar.setColorChanger(mainPanel);

        mainPanel.changeColor(Color.WHITE);

        setLayout(new BorderLayout());

        add(toolBar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(CustomFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
