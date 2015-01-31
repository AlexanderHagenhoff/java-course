package de.javacourse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerTest
{
    private Checker checker;

    @Before
    public void setUp()
    {
        this.checker = new Checker();
    }

    @Test
    public void isX_should_return_false_for_input_1() throws Exception
    {
        boolean result = checker.isX(1);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_2() throws Exception
    {
        boolean result = checker.isX(2);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_true_for_input_3() throws Exception
    {
        boolean result = checker.isX(3);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_false_for_input_4() throws Exception
    {
        boolean result = checker.isX(4);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_5() throws Exception
    {
        boolean result = checker.isX(5);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_false_for_input_6() throws Exception
    {
        boolean result = checker.isX(6);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_7() throws Exception
    {
        boolean result = checker.isX(7);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_false_for_input_8() throws Exception
    {
        boolean result = checker.isX(8);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_false_for_input_9() throws Exception
    {
        boolean result = checker.isX(9);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_false_for_input_10() throws Exception
    {
        boolean result = checker.isX(10);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_11() throws Exception
    {
        boolean result = checker.isX(11);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_false_for_input_12() throws Exception
    {
        boolean result = checker.isX(12);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_13() throws Exception
    {
        boolean result = checker.isX(13);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_false_for_input_14() throws Exception
    {
        boolean result = checker.isX(14);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_false_for_input_15() throws Exception
    {
        boolean result = checker.isX(15);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_false_for_input_16() throws Exception
    {
        boolean result = checker.isX(16);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_17() throws Exception
    {
        boolean result = checker.isX(17);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_false_for_input_18() throws Exception
    {
        boolean result = checker.isX(18);

        assertFalse(result);
    }

    @Test
    public void isX_should_return_true_for_input_19() throws Exception
    {
        boolean result = checker.isX(19);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_true_for_input_491() throws Exception
    {
        boolean result = checker.isX(491);

        assertTrue(result);
    }

    @Test
    public void isX_should_return_true_for_input_492() throws Exception
    {
        boolean result = checker.isX(492);

        assertFalse(result);
    }
}
