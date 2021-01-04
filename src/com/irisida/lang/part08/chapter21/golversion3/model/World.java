package com.irisida.lang.part08.chapter21.golversion3.model;

import java.util.Arrays;
import java.util.Random;

public class World {

    private int rows;
    private int columns;
    private Random random = new Random();
    private boolean[][] grid;
    private boolean[][] temporaryGrid;

    public World(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        grid = new boolean[rows][columns];
        temporaryGrid = new boolean[rows][columns];
    }

    public boolean getCell(int row, int column) {
        return grid[row][column];
    }

    public void setCell(int row, int column, boolean status) {
        grid[row][column] = status;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void randomize() {
        clearGrid();

        for (int i = 0; i < (rows * columns) / 4; i++) {
            int r = random.nextInt(rows);
            int c = random.nextInt(columns);

            setCell(r, c, true);
        }

    }

    public void clearGrid() {
        for (int r = 0; r < rows; r++) {
            Arrays.fill(grid[r], false);
        }
    }

    public void next() {
        int count;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.println("(" + r + "," + c + ")");
                count = getActiveNeighbourCells(r, c);
                System.out.println("Count is: " + count);

                /*
                 * if neighbouring cell count is less then two, or greater than 3
                 * (under-resourced/over-resourced) we should kill the cell.
                 */

                if (count < 2 || count > 3) {
                    temporaryGrid[r][c] = false;
                }

                /*
                 * if neighbouring count equals three we want to activate the cell
                 */
                if (count == 3) {
                    temporaryGrid[r][c] = true;
                }

                /*
                 * keep state as it was.
                 */
                if (count == 2) {
                    temporaryGrid[r][c] = getCell(r, c);
                }
            }
        }

        // update the whole grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                grid[r][c] = temporaryGrid[r][c];
            }
        }

    }

    private int getActiveNeighbourCells(int rowNumber, int columnNumber) {
        int count = 0;

        for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
            for (int colOffset = -1; colOffset <= 1; colOffset++) {
                // check left edges
                if (rowOffset == 0 && colOffset == 0) {
                    continue;
                }

                int gridRow = rowNumber + rowOffset;
                int gridCol = columnNumber + colOffset;

                if (gridRow < 0 || gridRow == rows) {
                    continue;
                }

                if (gridCol < 0 || gridCol == columns) {
                    continue;
                }

                if (getCell(gridRow, gridCol)) {
                    count++;
                }
            }
        }
        return count;
    }

}
