package de.javacourse;

import java.util.Random;

public class BoardFactory {

    private int rows;
    private int cols;

    private Cell[][] cells;
    private Board board;

    public BoardFactory createBoard(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];

        populateCells();
        createBoard();

        return this;
    }

    private void populateCells()
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(getRandomDeadOrAlive());
            }
        }
    }

    public void createBoard()
    {
        board = new Board(cells);
    }

    private boolean getRandomDeadOrAlive()
    {
        Random rand = new Random();
        int alive = rand.nextInt((1) + 1);

        return (alive == 1);
    }

    public Board getBoard()
    {
        return board;
    }
}
