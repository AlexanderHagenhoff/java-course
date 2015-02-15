package de.javacourse;

import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by c.horsch on 15.02.2015.
 */

public class Rules_Test {

    @Test
    public void cell_is_death_and_2_Neighbours_are_alive_should_return_false()
    {
       Cell cell= new Cell();
       cell.setAlivePresent(false);

       Rules rules= new Rules();

       assertFalse(rules.isAliveFuture(cell, 2));
    }


    @Test
    public void cell_is_death_and_3_Neighbours_are_alive_should_return_true()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(false);

        Rules rules= new Rules();

        assertTrue(rules.isAliveFuture(cell, 3));
    }

    @Test
    public void cell_is_death_and_4_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(false);

        Rules rules= new Rules();

        assertFalse(rules.isAliveFuture(cell, 4));
    }

    @Test
    public void cell_is_alive_and_4_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= new Rules();

        assertFalse(rules.isAliveFuture(cell, 4));
    }

    @Test
    public void cell_is_alive_and_1_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= new Rules();

        assertFalse(rules.isAliveFuture(cell, 1));
    }

    @Test
    public void cell_is_alive_and_0_Neighbours_are_alive_should_return_false()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= new Rules();

        assertFalse(rules.isAliveFuture(cell, 0));
    }

    @Test
    public void cell_is_alive_and_2_Neighbours_are_alive_should_return_true()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= new Rules();

        assertTrue(rules.isAliveFuture(cell, 2));
    }

    @Test
    public void cell_is_alive_and_3_Neighbours_are_alive_should_return_true()
    {
        Cell cell= new Cell();
        cell.setAlivePresent(true);

        Rules rules= new Rules();

        assertTrue(rules.isAliveFuture(cell, 3));
    }

}