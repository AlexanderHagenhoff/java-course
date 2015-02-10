package de.javacourse;

import java.util.Random;

public class BoardFactory
{
    public Board createBoard(int width, int height)
    {
        Board board = new Board(width, height);

        populateBoard(board);

        return board;
    }

    private void populateBoard(Board board)
    {
        for (int y = 0; y < board.getHeigth(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                Cell cell = board.getCell(x,y);
                cell.setAlivePresent(getRandomDeadOrAliveCell());
            }
        }
    }

    private boolean getRandomDeadOrAliveCell()
    {
        Random rand = new Random();
        int alive = rand.nextInt(2);

        return alive == 1;
    }
}
