package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;

import java.util.List;

public class Rules
{
    private List<Rule> rules;

    public Rules(List<Rule> rules)
    {
        this.rules = rules;
    }

    public boolean isAliveFuture(Cell cell, int neighboursAliveCount)
    {
        for (Rule rule : rules){
            if (rule.isApplicable(cell, neighboursAliveCount)){
                return rule.getFutureAlive(cell, neighboursAliveCount);
            }
        }

        throw new RuntimeException("no matching rule");
    }
}
