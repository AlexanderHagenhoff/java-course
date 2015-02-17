package de.javacourse.rules;

import de.javacourse.Cell;

public interface Rule
{
    public boolean hasResult(Cell cell, int neighboursAliveCount);

    public boolean getFutureAlive(Cell cell, int neighboursAliveCount) throws RuntimeException;
}
