package com.irisida.lang.part05.chapter14.swinginnerclases;

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

public class ToolBar extends JToolBar {
    private static final long serialVersionUID = 1L;
    private ColorChangeListener colorChanger;

    public void setColorChanger(ColorChangeListener colorChanger) {
        this.colorChanger = colorChanger;
    }

    public ToolBar() {
        final JButton orangeButton = new JButton("Orange");
        final JButton redButton = new JButton("Red");

        orangeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                colorChanger.changeColor(Color.ORANGE);
            }
        });
        redButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                colorChanger.changeColor(Color.RED);
            }

        });

        add(orangeButton);
        add(redButton);
    }

}
