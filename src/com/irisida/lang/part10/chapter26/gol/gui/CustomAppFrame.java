package com.irisida.lang.part10.chapter26.gol.gui;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.MenuItem;
import java.awt.Menu;
import java.awt.MenuBar;

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

        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");

        Menu fileMenu = new Menu("File");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        MenuBar menuBar = new MenuBar();
        menuBar.add(fileMenu);

        setMenuBar(menuBar);

        JFileChooser fileChooser = new JFileChooser();

        openItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OPEN");
            }

        });

        saveItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("SAVE");
                int userOption = fileChooser.showSaveDialog(CustomAppFrame.this);

                if (userOption == JFileChooser.APPROVE_OPTION) {

                }
            }

        });

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
