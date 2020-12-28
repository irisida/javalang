package com.irisida.lang.part04.chapter12.buttonclicks.colorlistenerclass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

/*
 * First wave of improvement to the program reduces the number of classes
 * in play here. We removed the OrangeButtonListener and RedButtonListener
 * to replace it with a ColorButtonListener that also accepts a color as a
 * parameter.
 *
 * What remains wrong in this version is:
 * 1. reduced reusability because the toolbar is tied to a mainPanel.
 * 2.
 */

class ColorButtonListener implements ActionListener {
    private CustomPanel mainPanel;
    private Color color;

    // constructor takes a panel and now a color too!
    public ColorButtonListener(CustomPanel mainPanel, Color color) {
        this.mainPanel = mainPanel;
        this.color = color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainPanel.changeBGColor(this.color);

    }
}

public class ToolBar extends JToolBar {
    private static final long serialVersionUID = 1L;

    public ToolBar(CustomPanel mainPanel) {
        final JButton orangeButton = new JButton("Orange");
        final JButton redButton = new JButton("Red");

        orangeButton.addActionListener(new ColorButtonListener(mainPanel, Color.ORANGE));
        redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED));

        add(orangeButton);
        add(redButton);
    }
}
