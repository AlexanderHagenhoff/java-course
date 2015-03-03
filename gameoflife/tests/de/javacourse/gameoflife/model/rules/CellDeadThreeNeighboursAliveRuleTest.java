package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellDeadThreeNeighboursAliveRuleTest
{
    @Test
    public void isApplicable_should_return_true_on_cell_dead_three_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rule rule = new CellDeadThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 3);

        assertTrue(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_dead_four_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rule rule = new CellDeadThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 4);

        assertFalse(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_dead_two_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rule rule = new CellDeadThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 2);

        assertFalse(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_alive_three_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellDeadThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 3);

        assertFalse(result);
    }

    @Test
    public void getFutureAlive_should_return_true_on_cell_dead_three_neighbours_alive() throws Exception
    {
        Rule rule = new CellDeadThreeNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(false);

        boolean result = rule.getFutureAlive(cell, 3);

        assertTrue(result);
    }

    @Test(expected = RuntimeException.class)
    public void getFutureAlive_should_throw_exception_on_cell_alive_three_neighbours_alive() throws Exception
    {
        Rule rule = new CellDeadThreeNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(true);

        rule.getFutureAlive(cell, 3);
    }
}
