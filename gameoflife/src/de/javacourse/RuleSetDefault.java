package de.javacourse;

public class RuleSetDefault implements Rules
{
    public boolean getBordersAreLimiting()
    {
        return true;
    }

    public boolean isAliveFuture(Cell cell, int neighboursAliveCount)
    {
        return cell.isAlivePresent() && (neighboursAliveCount == 2 || neighboursAliveCount == 3) ||
                !cell.isAlivePresent() && neighboursAliveCount == 3;
    }
}
