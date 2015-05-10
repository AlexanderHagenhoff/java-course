package de.javacourse.gameoflife.model;

public class NeighbourHelper
{
    private Board board;

    public NeighbourHelper(Board board)
    {
        this.board = board;
    }

    public int getNeighboursAliveCount(int x, int y)
    {
        int count = 0;

        for (int j = y - 1; j <= y + 1; j++) {
            for (int i = x - 1; i <= x + 1; i++) {
                if (j == y && i == x) {
                    continue;
                }
                Cell cell = board.getCell(i, j);
                if (cell != null && cell.isAlivePresent()) {
                    count++;
                }
                if (count >= 4) {
                    return 4;
                }
            }
        }

        return count;
    }
}
