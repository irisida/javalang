package com.irisida.lang.part08.chapter19.golversion1;

import javax.swing.JFrame;

import java.awt.BorderLayout;

public class CustomAppFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public CustomAppFrame() {
        this("untitled");
    }

    public CustomAppFrame(String windowTitle) {
        super(windowTitle);

        setLayout(new BorderLayout());
        add(new CustomAppPanel(), BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(CustomAppFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
