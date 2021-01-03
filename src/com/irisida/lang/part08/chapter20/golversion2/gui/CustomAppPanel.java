package com.irisida.lang.part08.chapter20.golversion2.gui;

import javax.swing.JPanel;

import com.irisida.lang.part08.chapter20.golversion2.model.World;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CustomAppPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private static final int CELLSIZE = 50;

    private static final Color BGCOLOR = Color.BLACK;
    private static final Color FGCOLOR = Color.GREEN;
    private static final Color GRIDCOLOR = Color.GRAY;

    private int topBottomMargin;
    private int leftRightMargin;

    public CustomAppPanel() {
        // explain
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
        topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

        int numberOfCols = (width - 2 * leftRightMargin) / CELLSIZE;
        int numberOfRows = (height - 2 * topBottomMargin) / CELLSIZE;
        System.out.printf("rows: %d  cols: %d %n", numberOfRows, numberOfCols);

        World gameWorld = new World(numberOfRows, numberOfCols);

        g2.setColor(BGCOLOR);
        g2.fillRect(0, 0, width, height);

        drawGrid(g2, width, height);

        gameWorld.setCell(2, 2, true);

        for (int r = 0; r < numberOfRows; r++) {
            for (int c = 0; c < numberOfCols; c++) {
                fillCell(g2, r, c, gameWorld.getCell(r, c));
            }
        }

    }

    private void drawGrid(Graphics2D g2, int width, int height) {
        /*
         * add a single CELLSIZE to the mod calculation in the event we perform
         * calculation and the division yields a zero remainder.
         */
        leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
        topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

        g2.setColor(GRIDCOLOR);

        for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
            g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
        }

        for (int y = topBottomMargin; y <= height - topBottomMargin; y += CELLSIZE) {
            g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
        }
    }

    private void fillCell(Graphics2D g2, int row, int col, boolean status) {
        int x = leftRightMargin + (col * CELLSIZE);
        int y = topBottomMargin + (row * CELLSIZE);

        Color color = status ? FGCOLOR : BGCOLOR;
        g2.setColor(color);

        g2.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);
    }

}
