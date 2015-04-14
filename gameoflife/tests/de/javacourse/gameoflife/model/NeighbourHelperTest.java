package de.javacourse.gameoflife.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NeighbourHelperTest
{
    @Test
    public void getNeighboursAliveCount_should_return_0() throws Exception
    {
        Board board = new Board(3, 3);
        NeighbourHelper helper = new NeighbourHelper(board);

        int result = helper.getNeighboursAliveCount(1, 1);

        assertEquals(0, result);
    }

    @Test
    public void getNeighboursAliveCount_should_return_1() throws Exception
    {
        Board board = new Board(3, 3);
        Cell cell = board.getCell(0, 0);
        cell.setAlivePresent(true);
        NeighbourHelper helper = new NeighbourHelper(board);

        int result = helper.getNeighboursAliveCount(1, 1);

        assertEquals(1, result);
    }

    @Test
    public void getNeighboursAliveCount_should_return_5() throws Exception
    {
        Board board = new Board(3, 3);
        board.getCell(0, 0).setAlivePresent(true);
        board.getCell(0, 1).setAlivePresent(true);
        board.getCell(0, 2).setAlivePresent(true);
        board.getCell(1, 0).setAlivePresent(true);
        board.getCell(1, 2).setAlivePresent(true);
        NeighbourHelper helper = new NeighbourHelper(board);

        int result = helper.getNeighboursAliveCount(1, 1);

        assertEquals(5, result);
    }

    @Test
    public void getNeighboursAliveCount_should_return_2_on_board_edge() throws Exception
    {
        Board board = new Board(3, 3);
        board.getCell(0, 0).setAlivePresent(true);
        board.getCell(0, 1).setAlivePresent(true);
        board.getCell(0, 2).setAlivePresent(true);
        board.getCell(1, 0).setAlivePresent(true);
        board.getCell(1, 2).setAlivePresent(true);
        NeighbourHelper helper = new NeighbourHelper(board);

        int result = helper.getNeighboursAliveCount(0, 0);

        assertEquals(2, result);
    }

    @Test
    public void getNeighboursAliveCount_should_return_0_position_out_of_bounds() throws Exception
    {
        Board board = new Board(3, 3);
        board.getCell(0, 0).setAlivePresent(true);
        board.getCell(0, 1).setAlivePresent(true);
        board.getCell(0, 2).setAlivePresent(true);
        board.getCell(1, 0).setAlivePresent(true);
        board.getCell(1, 2).setAlivePresent(true);
        NeighbourHelper helper = new NeighbourHelper(board);

        int result = helper.getNeighboursAliveCount(100, 100);

        assertEquals(0, result);
    }
}