package de.javacourse.gameoflife.model;

public class Board {
    private Cell[][] cells;

    public Board(int width, int height) {
        cells = new Cell[width][height];

        for (int y = 0; y < this.getHeigth(); y++) {
            for (int x = 0; x < this.getWidth(); x++) {
                cells[x][y] = new Cell();
            }
        }
    }

    public Cell getCell(int x, int y)
    {
        if (isOutOfBounds(x, y)) {
            return null;
        }

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

    private boolean isOutOfBounds(int x, int y) {
        return x < 0 || x >= getWidth() || y < 0 || y >= getHeigth();
    }
}
