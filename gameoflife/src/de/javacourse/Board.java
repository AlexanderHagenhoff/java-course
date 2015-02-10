package de.javacourse;

public class Board
{
    private Cell[][] cells;

    public Board(int width, int height)
    {
        cells = new Cell[width][height];

        for (int y = 0; y < this.getHeigth(); y++) {
            for (int x = 0; x < this.getWidth(); x++) {
                Cell cell = new Cell();
                cells[x][y] = cell;
            }
        }
    }

    public Cell getCell(int x, int y){
        return cells[x][y];
    }

    public int getWidth()
    {
        return cells.length;
    }

    public int getHeigth()
    {
        return cells[0].length;
    }
}
