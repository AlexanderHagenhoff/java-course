package de.javacourse;

public class Board
{
    private Cell[][] cells;

    public Board(Cell[][] cells)
    {
        this.cells = cells;
    }

    public Cell[][] getCells()
    {
        return cells;
    }
}
