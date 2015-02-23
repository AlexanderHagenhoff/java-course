package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by c.horsch on 15.02.2015.
 */

public class RulesTest
{
    @Test
    public void cell_is_dead_and_2_Neighbours_are_alive_should_return_false()
    {
       Cell cell= new Cell();
       cell.setAlivePresent(false);
 
       Rules rules= createRules();

       assertFalse(rules.isAliveFuture(cell, 2));
    }


    @Test
    public void cell_is_dead_and_3_Neighbours_are_alive_should_return_true()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(false);

        Rules rules= createRules();

        assertTrue(rules.isAliveFuture(cell, 3));
    }

    @Test
    public void cell_is_dead_and_4_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(false);

        Rules rules= createRules();

        assertFalse(rules.isAliveFuture(cell, 4));
    }

    @Test
    public void cell_is_alive_and_4_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= createRules();

        assertFalse(rules.isAliveFuture(cell, 4));
    }

    @Test
    public void cell_is_alive_and_1_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= createRules();

        assertFalse(rules.isAliveFuture(cell, 1));
    }

    @Test
    public void cell_is_alive_and_0_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= createRules();

        assertFalse(rules.isAliveFuture(cell, 0));
    }

    @Test
    public void cell_is_alive_and_2_Neighbours_are_alive_should_return_true()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= createRules();

        assertTrue(rules.isAliveFuture(cell, 2));
    }

    @Test
    public void cell_is_alive_and_3_Neighbours_are_alive_should_return_true()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= createRules();

        assertTrue(rules.isAliveFuture(cell, 3));
    }

    private Rules createRules(){
        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new CellAliveTwoNeighboursAliveRule());
        rules.add(new CellAliveThreeNeighboursAliveRule());
        rules.add(new CellAliveNotTwoOrThreeNeighboursAliveRule());
        rules.add(new CellDeadThreeNeighboursAliveRule());
        rules.add(new CellDeadNotThreeNeighboursAliveRule());

        return new Rules(rules);
    }

}
