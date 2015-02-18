package de.javacourse.gameoflife.model;

public class Cell
{
    private boolean alivePresent = false;
    private boolean aliveFuture = false;

    public Cell(){
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
