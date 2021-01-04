package com.irisida.lang.part08.chapter21.golversion3.gui;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CustomAppFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private CustomAppPanel gamePanel = new CustomAppPanel();

    public CustomAppFrame() {
        this("untitled");
    }

    public CustomAppFrame(String windowTitle) {
        super(windowTitle);

        /*
         * Set the layout and add a new panel that is centered to take up the dimensions
         * of the window we are creating.
         */
        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);

        /*
         * The main Frame will always consume keyboard events so we will catch them here
         * muse events are caught in the panel of the app because they caught at the
         * panel level.
         */
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();

                switch (code) {
                    case 32:
                        gamePanel.next();
                        break;
                    case 8:
                        gamePanel.clearGrid();
                        break;
                    case 10:
                        gamePanel.randomize();
                        break;
                    default:
                        break;
                }
            }
        });

        setSize(800, 600);
        setDefaultCloseOperation(CustomAppFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
