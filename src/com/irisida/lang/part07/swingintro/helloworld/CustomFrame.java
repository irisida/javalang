package com.irisida.lang.part07.swingintro.helloworld;

import javax.swing.JFrame;

public class CustomFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public CustomFrame() {
        this("No title given");
    }

    public CustomFrame(String windowTitle) {
        super(windowTitle);
        setSize(600, 400);
        setDefaultCloseOperation(CustomFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
