package de.javacourse;

import java.util.Random;

public class BoardFactory
{
    private int cols;

    private int rows;

    public Cell[][] createBoard(int rows, int cols)
    {
        Cell[][] cells = new Cell[rows][cols];
        this.rows = rows;
        this.cols = cols;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                Random rand = new Random();
                boolean x = rand.nextBoolean();
                Cell cell = new Cell(x);

                cells[i][j] = cell;
            }
        }

        return cells;
    }

    public int getCols()
    {
        return cols;
    }

    public int getRows()
    {
        return rows;
    }
}
