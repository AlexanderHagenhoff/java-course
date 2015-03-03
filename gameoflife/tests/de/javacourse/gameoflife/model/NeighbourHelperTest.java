package de.javacourse.gameoflife.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NeighbourHelperTest {

    private Board board;

    private NeighbourHelper neighbourHelper;

    @Before
    public void setUp()
    {
        neighbourHelper = new NeighbourHelper();
        board = new Board(3, 3);
    }

    @Test
    public void test_getNeighboursAliveCount_cell_alive_two_neighbours_alive_should_return_two() throws Exception
    {
        setCellAlive(board, 0, 0);
        setCellAlive(board, 0, 2);
        setCellAlive(board, 1, 1);

        int result = neighbourHelper.getNeighboursAliveCount(board, 1, 1);

        assertEquals(2, result);
    }

    @Test
    public void test_getNeighboursAliveCount_cell_dead_two_neighbours_alive_should_return_two() throws Exception
    {
        setCellAlive(board, 0, 0);
        setCellAlive(board, 0, 2);

        int result = neighbourHelper.getNeighboursAliveCount(board, 1, 1);

        assertEquals(2, result);
    }

    @Test
    public void test_getNeighboursAliveCount_cell_dead_three_neighbours_alive_should_return_three() throws Exception
    {
        setCellAlive(board, 0, 0);
        setCellAlive(board, 0, 2);
        setCellAlive(board, 2, 2);

        int result = neighbourHelper.getNeighboursAliveCount(board, 1, 1);

        assertEquals(3, result);
    }

    @Test
    public void test_getNeighboursAliveCount_can_handle_cell_out_of_bounds()
    {
        setCellAlive(board, 0, 0);
        setCellAlive(board, 0, 2);
        setCellAlive(board, 1, 1);

        int result = neighbourHelper.getNeighboursAliveCount(board, 0, 0);

        assertEquals(1, result);
    }

    private void setCellAlive(Board board, int x, int y)
    {
        Cell cell = board.getCell(x, y);

        cell.setAlivePresent(true);
    }
}
