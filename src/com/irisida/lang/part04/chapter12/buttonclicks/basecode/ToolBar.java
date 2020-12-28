package com.irisida.lang.part04.chapter12.buttonclicks.basecode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;

class orangeButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Orange Button was clicked");

    }
}

class redButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Red Button was clicked");

    }
}

public class ToolBar extends JToolBar {
    private static final long serialVersionUID = 1L;

    public ToolBar() {
        final JButton orangeButton = new JButton("Orange");
        final JButton redButton = new JButton("Red");

        orangeButton.addActionListener(new orangeButtonListener());
        redButton.addActionListener(new redButtonListener());

        add(orangeButton);
        add(redButton);
    }
}
