package com.irisida.lang.part08.chapter20.golversion2.model;

public class World {
    private boolean[][] grid;

    public World(int rows, int columns) {

        grid = new boolean[rows][columns];
    }

    public boolean getCell(int row, int column) {
        return grid[row][column];
    }

    public void setCell(int row, int column, boolean status) {
        grid[row][column] = status;
    }
}
