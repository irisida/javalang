package com.irisida.lang.part08.chapter19.golversion1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CustomAppPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private final static int CELLSIZE = 50;

    private final static Color BGCOLOR = Color.BLACK;
    private final static Color FGCOLOR = Color.GREEN;
    private final static Color GRIDCOLOR = Color.GRAY;
    private final static Color TESTCOLOR = Color.ORANGE;

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

        /*
         * add a single CELLSIZE to the mod calculation in the event we perform
         * calculation and the division yields a zero remainder.
         */
        leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
        topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

        g2.setColor(BGCOLOR);
        g2.fillRect(0, 0, width, height);

        drawGrid(g2, width, height);

        fillCell(g2, 2, 2, true);
        fillCell(g2, 2, 2, false);
        fillCell(g2, 3, 3, true);
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
