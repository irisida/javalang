package com.irisida.lang.part04.chapter12.buttonclicks.naiveupdates;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class OrangeButtonListener implements ActionListener {
    private CustomPanel mainPanel;

    // constructor takes a panel
    public OrangeButtonListener(CustomPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Orange Button was clicked");
        // use reference to our panel and call color change.
        mainPanel.changeBGColor(Color.ORANGE);

    }
}

class RedButtonListener implements ActionListener {
    private CustomPanel mainPanel;

    public RedButtonListener(CustomPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Red Button was clicked");
        mainPanel.changeBGColor(Color.RED);
    }
}

public class ToolBar extends JToolBar {
    private static final long serialVersionUID = 1L;

    public ToolBar(CustomPanel mainPanel) {
        final JButton orangeButton = new JButton("Orange");
        final JButton redButton = new JButton("Red");

        orangeButton.addActionListener(new OrangeButtonListener(mainPanel));
        redButton.addActionListener(new RedButtonListener(mainPanel));

        add(orangeButton);
        add(redButton);
    }
}
