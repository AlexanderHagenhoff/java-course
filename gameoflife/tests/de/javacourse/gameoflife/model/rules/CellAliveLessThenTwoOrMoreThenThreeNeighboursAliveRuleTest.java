package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRuleTest
{
    @Test
    public void isApplicable_should_return_true_on_cell_alive_one_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 1);

        assertTrue(result);
    }

    @Test
    public void isApplicable_should_return_true_on_cell_alive_four_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 4);

        assertTrue(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_alive_five_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 5);

        assertTrue(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_alive_three_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 3);

        assertFalse(result);
    }

    @Test
    public void isApplicable_should_return_false_on_cell_alive_two_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        boolean result = rule.isApplicable(cell, 2);

        assertFalse(result);
    }

    @Test
    public void getFutureAlive_should_return_false_on_cell_alive_four_neighbours_alive() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        boolean result = rule.getFutureAlive(cell, 4);

        assertFalse(result);
    }

    @Test(expected = RuntimeException.class)
    public void getFutureAlive_should_throw_exception_on_cell_dead_three_neighbours_alive() throws Exception
    {
        Rule rule = new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(false);

        rule.getFutureAlive(cell, 3);
    }
}
