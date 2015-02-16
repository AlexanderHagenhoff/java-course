package de.javacourse;

interface Rules
{
    public boolean getBordersAreLimiting();
    public boolean isAliveFuture(Cell cell, int neighboursAliveCount);
}
