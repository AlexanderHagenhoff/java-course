package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CellAliveThreeNeighboursAliveRuleTest
{
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, 3, true},
                {true, 1, false},
                {true, 2, false},
                {true, 4, false},
                {true, 5, false},
                {false, 2, false},
                {false, 3, false},
        });
    }

    @Parameterized.Parameter(value = 0)
    public boolean InputCellIsAlive;

    @Parameterized.Parameter(value = 1)
    public int neighboursAliveCount;

    @Parameterized.Parameter(value = 2)
    public boolean expected;

    @Test
    public void isApplicable_should_return_true_on_cell_alive_and_two_or_three_neighbours_alive_or_false() throws Exception
    {
        Cell cell = new Cell();
        cell.setAlivePresent(InputCellIsAlive);

        Rule rule = new CellAliveThreeNeighboursAliveRule();

        assertEquals(expected, rule.isApplicable(cell, neighboursAliveCount));

    }

    @Test
    public void getFutureAlive_should_return_true_on_cell_alive_three_neighbours_alive() throws Exception
    {
        Rule rule = new CellAliveThreeNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(true);

        boolean result = rule.getFutureAlive(cell, 3);

        assertTrue(result);
    }

    @Test(expected = RuntimeException.class)
    public void getFutureAlive_should_throw_exception_on_cell_dead_three_neighbours_alive() throws Exception
    {
        Rule rule = new CellAliveThreeNeighboursAliveRule();

        Cell cell = new Cell();
        cell.setAlivePresent(false);

        rule.getFutureAlive(cell, 3);
    }
}
