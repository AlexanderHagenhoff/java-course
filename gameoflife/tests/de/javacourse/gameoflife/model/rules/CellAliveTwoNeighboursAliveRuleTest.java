package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellAliveTwoNeighboursAliveRuleTest
{
    @Test
    public void isApplicable_should_return_true_on_cell_alive_two_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveTwoNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 2);

        assertTrue(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_alive_three_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveTwoNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 3);

        assertFalse(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_alive_one_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveTwoNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 1);

        assertFalse(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_dead_two_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rule rule = new CellAliveTwoNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 2);

        assertFalse(result);
    }

    @Test
    public void getFutureAlive_should_return_true_on_cell_alive_two_neighbours_alive() throws Exception
    {
        Rule rule = new CellAliveTwoNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(true);

        boolean result = rule.getFutureAlive(cell, 2);

        assertTrue(result);
    }

    @Test(expected = RuntimeException.class)
    public void getFutureAlive_should_throw_exception_on_cell_dead_two_neighbours_alive() throws Exception
    {
        Rule rule = new CellAliveTwoNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(false);

        rule.getFutureAlive(cell, 2);
    }
}
