package com.irisida.lang.part04.chapter12.buttonclicks.basecode;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class CustomFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public CustomFrame() {
        this("No title given");
    }

    public CustomFrame(String windowTitle) {
        super(windowTitle);

        setLayout(new BorderLayout());

        add(new ToolBar(), BorderLayout.NORTH);
        add(new CustomPanel(), BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(CustomFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
