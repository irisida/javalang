package com.irisida.lang.part10.chapter26.gol.gui;

import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import com.irisida.lang.part10.chapter26.gol.model.World;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CustomAppPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private static final int CELLSIZE = 5;

    private static final Color BGCOLOR = Color.BLACK;
    private static final Color FGCOLOR = Color.GREEN;
    private static final Color LINECOLOR = new Color(35, 35, 35);

    private transient World gameWorld;

    private int topBottomMargin;
    private int leftRightMargin;

    public CustomAppPanel() {
        System.out.println("inside CustomAppPanel constructor");
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                /*
                 * handle bad input clicks outside the grid on the left and top sides of the
                 * grid. A user prompt would be clunky and heavy handed so we can silently catch
                 * the occurrence and pass through without any action.
                 */
                if (e.getX() < leftRightMargin || e.getY() < topBottomMargin) {
                    // gracefully and silently handle bad input
                    return;
                }

                /*
                 * get the X&Y of where the grid was clicked and take away the impacting margins
                 * to be able to derive the square of the grid that was clicked.
                 */

                int row = (e.getY() - topBottomMargin) / CELLSIZE;
                int column = (e.getX() - leftRightMargin) / CELLSIZE;

                /*
                 * Handles any clicks outside the grid on the bottom and right. Again error
                 * prompting would be too much so we can once again silently fallthrough without
                 * any course of action taken.
                 */
                if (row >= gameWorld.getRows() || column >= gameWorld.getColumns()) {
                    return;
                }

                /*
                 * Then we get the currentStatus of the element from the gameWorld array toggle
                 * the value in a call to setCell().
                 */
                boolean currentStatus = gameWorld.getCell(row, column);
                gameWorld.setCell(row, column, !currentStatus);

                /*
                 * finally we should repaint the component
                 */
                repaint();
            }
        });
        System.out.println("exiting CustomAppPanel constructor");
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

        if (gameWorld == null) {
            gameWorld = new World(numberOfRows, numberOfCols);
        } else {
            if (gameWorld.getRows() != numberOfRows || gameWorld.getColumns() != numberOfCols) {
                gameWorld = new World(numberOfRows, numberOfCols);
            }
        }

        g2.setColor(BGCOLOR);
        g2.fillRect(0, 0, width, height);

        drawGrid(g2, width, height);

        for (int r = 0; r < numberOfRows; r++) {
            for (int c = 0; c < numberOfCols; c++) {
                fillCell(g2, r, c, gameWorld.getCell(r, c));
            }
        }

    }

    private void drawGrid(Graphics2D g2, int width, int height) {
        /*
         * Sets the color of the Graphics2d Object to the colour we want to use for
         * drawing the grid lines. Uses two loops, one to draw each of the horizontal
         * lines and one to draw the vertical lines. Note: the increment on the loop in
         * the
         */
        g2.setColor(LINECOLOR);

        for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
            g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
        }

        for (int y = topBottomMargin; y <= height - topBottomMargin; y += CELLSIZE) {
            g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
        }
    }

    private void fillCell(Graphics2D g2, int row, int col, boolean status) {
        /*
         * Based upon the status of the cell that is passed in we toggle the value then
         * call the fillRect with some adapted values ot compensate for the grid lines.
         * Passing in unaltered values leaves the grid structure appearing damaged when
         * we reset a previously filled segment of the grid. Shaving two pixels off the
         * values and positioning with a +1 creates a 1 pixel border room around each of
         * the rects.
         */
        int x = leftRightMargin + (col * CELLSIZE);
        int y = topBottomMargin + (row * CELLSIZE);

        Color color = status ? FGCOLOR : BGCOLOR;
        g2.setColor(color);

        g2.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);
    }

    public void randomize() {
        gameWorld.randomize();
        repaint();
    }

    public void clearGrid() {
        gameWorld.clearGrid();
        repaint();
    }

    public void next() {
        gameWorld.next();
        repaint();
    }

    public void save(File selectedFile) {
        gameWorld.save(selectedFile);
    }

    public void load(File selectedFile) {
        gameWorld.load(selectedFile);
        repaint();
    }

}
