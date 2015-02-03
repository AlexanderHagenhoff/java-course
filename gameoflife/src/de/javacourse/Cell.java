package de.javacourse;

public class Cell
{
    private boolean alivePresent;
    private boolean aliveFuture;

    public Cell(boolean alivePresent)
    {
        this.alivePresent = alivePresent;
    }

    public boolean isAlivePresent()
    {
        return alivePresent;
    }

    public void setAlivePresent(boolean alivePresent)
    {
        this.alivePresent = alivePresent;
    }

    public boolean isAliveFuture()
    {
        return aliveFuture;
    }

    public void setAliveFuture(boolean aliveFuture)
    {
        this.aliveFuture = aliveFuture;
    }
}
