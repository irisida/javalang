package com.irisida.lang.part04.chapter12.buttonclicks.basecode;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar {
    private static final long serialVersionUID = 1L;

    public ToolBar() {
        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));
    }
}
