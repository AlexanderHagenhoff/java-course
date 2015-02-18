package de.javacourse.gameoflife.model.rules;

import de.javacourse.gameoflife.model.Cell;

public interface Rule
{
    public boolean isApplicable(Cell cell, int neighboursAliveCount);

    public boolean getFutureAlive(Cell cell, int neighboursAliveCount) throws RuntimeException;
}
