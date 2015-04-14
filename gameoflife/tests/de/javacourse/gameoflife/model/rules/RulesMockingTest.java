package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RulesMockingTest
{


    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void isAliveFuture_should_call_isApplicable_on_all_rules() throws Exception
    {
        List<Rule> ruleList = new ArrayList<Rule>();
        Rule rule1 = mock(Rule.class);
        Rule rule2 = mock(Rule.class);

        when(rule2.isApplicable(any(Cell.class), eq(5))).thenReturn(true);
        when(rule2.getFutureAlive(any(Cell.class), eq(5))).thenReturn(true);

        ruleList.add(rule1);
        ruleList.add(rule2);

        Rules rules = new Rules(ruleList);

        rules.isAliveFuture(mock(Cell.class), 5);

        verify(rule1).isApplicable(any(Cell.class), eq(5));
        verify(rule2).isApplicable(any(Cell.class), eq(5));
        verify(rule2).getFutureAlive(any(Cell.class), eq(5));
        verifyNoMoreInteractions(rule1);
        verifyNoMoreInteractions(rule2);
    }

    @Test(expected = RuntimeException.class)
    public void isAliveFuture_should_throw_exception_on_no_rules()
    {
        Iterator<Rule> iteratorMock = mock(Iterator.class);
        List<Rule> ruleList = mock(List.class);
        Rules rules = new Rules(ruleList);
        when(ruleList.iterator()).thenReturn(iteratorMock);
        when(iteratorMock.hasNext()).thenReturn(false);

        rules.isAliveFuture(mock(Cell.class), 5);
    }

    @Test
    public void isAliveFuture_should_call_isApplicable_on_all_rules_with_list_mock()
    {
        Iterator<Rule> iteratorMock = mock(Iterator.class);
        List<Rule> ruleList = mock(List.class);
        Rules rules = new Rules(ruleList);
        Rule rule = mock(Rule.class);

        when(ruleList.iterator()).thenReturn(iteratorMock);
        when(iteratorMock.hasNext()).thenReturn(true);
        when(iteratorMock.next()).thenReturn(rule);
        when(rule.isApplicable(any(Cell.class), eq(5))).thenReturn(true);
        when(rule.getFutureAlive(any(Cell.class), eq(5))).thenReturn(true);

        rules.isAliveFuture(mock(Cell.class), 5);

        verify(rule).isApplicable(any(Cell.class), eq(5));
        verify(rule).getFutureAlive(any(Cell.class), eq(5));
        verifyNoMoreInteractions(rule);
    }

}