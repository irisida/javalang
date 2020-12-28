package com.irisida.lang.part04.chapter12.buttonclicks.withinterfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

/*
 * second wave of improvement decouples the ToolBar and Panel classes.
 * Instead toolbar now knows about an interface called ColorChanger which has a very
 * small footprint of a single method called changeColor.
 */

class ColorButtonListener implements ActionListener {
    private ColorChangeListener colorChanger;
    private Color color;

    // constructor takes a panel and now a color too!
    public ColorButtonListener(ColorChangeListener colorChanger, Color color) {
        this.colorChanger = colorChanger;
        this.color = color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        colorChanger.changeColor(this.color);

    }
}

public class ToolBar extends JToolBar {
    private static final long serialVersionUID = 1L;

    public ToolBar(ColorChangeListener colorChanger) {
        final JButton orangeButton = new JButton("Orange");
        final JButton redButton = new JButton("Red");

        orangeButton.addActionListener(new ColorButtonListener(colorChanger, Color.ORANGE));
        redButton.addActionListener(new ColorButtonListener(colorChanger, Color.RED));

        add(orangeButton);
        add(redButton);
    }
}
