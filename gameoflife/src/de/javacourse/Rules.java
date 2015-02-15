package de.javacourse;


public class Rules
{
    public boolean isAliveFuture(Cell cell, int neighboursAliveCount)
    {
       if (!cell.isAlivePresent()){
           return neighboursAliveCount == 3;
       }

        if(cell.isAlivePresent()){
            if(neighboursAliveCount<2||neighboursAliveCount>3){
                return false;
            }else{
                return true;
            }
        }

        return false;
    }
}
