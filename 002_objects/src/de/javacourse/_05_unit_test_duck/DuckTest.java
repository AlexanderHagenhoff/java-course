package de.javacourse._05_unit_test_duck;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest
{
    @Test
    public void constructor_sets_name()
    {
        Duck duck = new Duck("my_name");

        assertEquals("my_name", duck.getName());
    }

    @Test
    public void hasName_returns_true_on_name_not_null()
    {
        Duck duck = new Duck();
        duck.setName("test");

        assertTrue(duck.hasName());
    }

    @Test
    public void hasName_returns_false_on_name_null()
    {
        Duck duck = new Duck();
        duck.setName(null);

        assertFalse(duck.hasName());
    }

    @Test
    public void setName_sets_name()
    {
        Duck duck = new Duck();
        duck.setName("my_name");

        assertEquals("my_name", duck.getName());
    }

    @Test
    public void getSentence_returns_expected_sentence_on_name_null()
    {
        Duck duck = new Duck();
        duck.setName(null);
        duck.setPattern("test test");

        String result = duck.getSentence();

        assertEquals("Ich habe keinen Namen test test", result);
    }

    @Test
    public void getSentence_returns_expected_sentence_on_name_set()
    {
        Duck duck = new Duck();
        duck.setName("my_name");
        duck.setPattern("test test");

        String result = duck.getSentence();

        assertEquals("Mein Name ist my_name test test", result);
    }

    @Test
    public void getSentence_returns_expected_sentence_on_name_set_pattern_null()
    {
        Duck duck = new Duck();
        duck.setName("my_name");
        duck.setPattern(null);

        String result = duck.getSentence();

        assertEquals("Mein Name ist my_name null", result);
    }

    @Test
    public void getSentence_returns_expected_sentence_on_name_null_pattern_null()
    {
        Duck duck = new Duck();
        duck.setName(null);
        duck.setPattern(null);

        String result = duck.getSentence();

        assertEquals("Ich habe keinen Namen null", result);
    }
}
