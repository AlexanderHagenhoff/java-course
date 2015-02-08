package de.javacourse;

/**
 * Created by c.horsch on 07.02.2015.
 */
public class ConsoleView {

    public void showBoard(Board board) {
        Cell[][] newboard = board.getCells();

        for (int i = 0; i < newboard.length; i++) {
            System.out.println();
            for (int j = 0; j < newboard[i].length; j++) {
                if (newboard[i][j].isAlivePresent()) {
                    System.out.print("*");
                } else {
                    System.out.print("°");
                }
            }
        }
    }
}
