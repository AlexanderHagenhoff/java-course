package de.javacourse;

public class ConsoleView implements View
{
    @Override
    public void render(Board board)
    {
        System.out.print("\n\n");

        for (int y = 0; y < board.getHeigth(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                char drawIcon = ' ';

                Cell cell = board.getCell(x,y);

                if (cell.isAlivePresent()) {
                    drawIcon = '*';
                }

                System.out.print(drawIcon);
            }

            System.out.print('\n');
        }

        System.out.print("\n\n");
    }
}
