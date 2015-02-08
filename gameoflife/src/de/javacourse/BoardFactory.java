package de.javacourse;

/**
 * Created by c.horsch on 07.02.2015.
 */
public class BoardFactory {

    public Board createBoard(int cols, int rows) {
        Cell[][] cells = new Cell[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j]= new Cell (initCell());
            }
        }
        return new Board(cells);
    }


    public boolean initCell()
    {
       return(Math.random()<= 0.5);
    }
}