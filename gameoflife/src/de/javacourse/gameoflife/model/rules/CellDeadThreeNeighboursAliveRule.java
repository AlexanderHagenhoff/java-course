package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;

public class CellDeadThreeNeighboursAliveRule implements Rule
{
    @Override
    public boolean isApplicable(Cell cell, int neighboursAliveCount)
    {
        return !cell.isAlivePresent() && neighboursAliveCount == 3;
    }

    @Override
    public boolean getFutureAlive(Cell cell, int neighboursAliveCount) throws RuntimeException
    {
        if (isApplicable(cell, neighboursAliveCount) == false) {
            throw new RuntimeException("no result");
        }

        return true;
    }
}
