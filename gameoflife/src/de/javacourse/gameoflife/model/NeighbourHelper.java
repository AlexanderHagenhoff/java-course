package de.javacourse.gameoflife.model;

public class NeighbourHelper
{
    public int getNeighboursAliveCount(Board board, int x, int y)
    {
        int neighboursAliveCount = 0;

        if (y != 0) {
            neighboursAliveCount += getNeighboursAliveCountForY(board, x, y - 1, false);
        }

        neighboursAliveCount += getNeighboursAliveCountForY(board, x, y, true);

        if (y != board.getHeigth() - 1) {
            neighboursAliveCount += getNeighboursAliveCountForY(board, x, y + 1, false);
        }

        return neighboursAliveCount;
    }

    private int getNeighboursAliveCountForY(Board board, int x, int y, boolean cellHasSameY)
    {
        int neighboursAliveCountForY = 0;

        if (x != 0) {
            neighboursAliveCountForY += (board.getCell(x - 1, y).isAlivePresent()) ? 1 : 0;
        }

        if (!cellHasSameY) {
            neighboursAliveCountForY += (board.getCell(x, y).isAlivePresent()) ? 1 : 0;
        }

        if (x != board.getWidth() - 1) {
            neighboursAliveCountForY += (board.getCell(x + 1, y).isAlivePresent()) ? 1 : 0;
        }

        return neighboursAliveCountForY;
    }
}
