package de.javacourse.gameoflife.view;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.Cell;

public class ConsoleView implements View
{
    @Override
    public void render(Board board)
    {
        System.out.print("\n\n");

        printLineNumbersX(board.getWidth());

        for (int y = 0; y < board.getHeigth(); y++) {
            System.out.print(getFormattedNumber(y) + " ");

            for (int x = 0; x < board.getWidth(); x++) {
                String drawIcon = "[ ]";

                Cell cell = board.getCell(x,y);

                if (cell.isAlivePresent()) {
                    drawIcon = "[*]";
                }

                System.out.print(drawIcon);
            }

            System.out.print('\n');
        }

        System.out.print("\n\n");
    }

    @Override
    public int getWidth()
    {
        return 20;
    }

    @Override
    public int getHeight()
    {
        return 20;
    }

    private void printLineNumbersX(int boardWidth)
    {
        System.out.print("    ");

        for (int i = 0; i < boardWidth; i++) {
            System.out.print(getFormattedNumber(i) + " ");
        }

        System.out.print("\n");
    }

    private String getFormattedNumber(int number)
    {
        String formattedNumber;

        if (number < 10) {
            formattedNumber = String.valueOf(number) + " ";
        } else {
            formattedNumber = String.valueOf(number);
        }

        return formattedNumber;
    }
}
