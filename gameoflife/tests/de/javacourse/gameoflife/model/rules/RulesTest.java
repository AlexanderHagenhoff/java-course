package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RulesTest
{
    @Test
    public void cell_is_death_and_2_Neighbours_are_alive_should_return_false() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rules rules = createRules();

        assertFalse(!rules.isAliveFuture(cell, 2));
    }

    @Test
    public void cell_is_death_and_3_Neighbours_are_alive_should_return_true() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rules rules = createRules();

        assertTrue(rules.isAliveFuture(cell, 3));
    }

    @Test
    public void cell_is_death_and_4_Neighbours_are_alive_should_return_false() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(false);

        Rules rules = createRules();

        assertFalse(rules.isAliveFuture(cell, 4));
    }

    @Test
    public void cell_is_alive_and_4_Neighbours_are_alive_should_return_false() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rules rules = createRules();

        assertFalse(rules.isAliveFuture(cell, 4));
    }

    @Test
    public void cell_is_alive_and_1_Neighbours_are_alive_should_return_false() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rules rules = createRules();

        assertFalse(rules.isAliveFuture(cell, 1));
    }

    @Test
    public void cell_is_alive_and_0_Neighbours_are_alive_should_return_false() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rules rules = createRules();

        assertFalse(rules.isAliveFuture(cell, 0));
    }

    @Test
    public void cell_is_alive_and_2_Neighbours_are_alive_should_return_true() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rules rules = createRules();

        assertTrue(rules.isAliveFuture(cell, 2));
    }

    @Test
    public void cell_is_alive_and_3_Neighbours_are_alive_should_return_true() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(true);

        Rules rules = createRules();

        assertTrue(rules.isAliveFuture(cell, 3));
    }

    private Rules createRules()
    {
        List<Rule> rules = new ArrayList<Rule>();

        rules.add(new CellDeadThreeNeighboursAliveRule());
        rules.add(new CellAliveTwoOrThreeNeighboursAliveRule());
        rules.add(new CellAliveLessThenTwoOrMoreThenThreeNeighboursAliveRule());
        rules.add(new CellDeadLessOrMoreThenThreeNeighboursAliveRule());

        return new Rules(rules);
    }
}
