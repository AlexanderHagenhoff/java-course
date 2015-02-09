package de.javacourse;

public class ConsoleView
{
    public void printBoardToConsole(Board board, int rows, int cols)
    {
        Cell[][] cells = board.getCells();

        System.out.print("\n\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char drawIcon = '+';

                if (cells[i][j].isAlivePresent()) {
                    drawIcon = 'o';
                }

                System.out.print(drawIcon);
            }

            System.out.print('\n');
        }

        System.out.print("\n\n");
    }
}
