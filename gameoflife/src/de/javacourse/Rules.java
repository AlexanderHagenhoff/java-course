package de.javacourse;

<<<<<<< Updated upstream
=======

import de.javacourse.rules.Rule;

import java.util.List;

>>>>>>> Stashed changes
public class Rules
{
    private List<Rule> rules;

    public Rules(List<Rule> rules)
    {
        this.rules = rules;
    }

    public boolean isAliveFuture(Cell cell, int neighboursAliveCount)
    {
<<<<<<< Updated upstream
        return false;
=======
        for (Rule rule : rules){
            if (rule.hasResult(cell, neighboursAliveCount)){
                return rule.getFutureAlive(cell, neighboursAliveCount);
            }
        }

        throw new RuntimeException("no matching rule");
>>>>>>> Stashed changes
    }
}


/*
        if (!cell.isAlivePresent()) {
            return neighboursAliveCount == 3;
        }

        if (neighboursAliveCount < 2 || neighboursAliveCount > 3) {
            return false;
        } else {
            return true;
        }
        */
