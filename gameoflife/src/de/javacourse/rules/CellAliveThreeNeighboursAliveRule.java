package de.javacourse.rules;

import de.javacourse.Cell;

public class CellAliveThreeNeighboursAliveRule implements Rule
{
    @Override
    public boolean hasResult(Cell cell, int neighboursAliveCount)
    {
        return cell.isAlivePresent() && neighboursAliveCount == 3;
    }

    @Override
    public boolean getFutureAlive(Cell cell, int neighboursAliveCount) throws RuntimeException
    {
        if (hasResult(cell, neighboursAliveCount) == false){
            throw new RuntimeException("no result");
        }

        return true;
    }
}
