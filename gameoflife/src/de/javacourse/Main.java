package de.javacourse;

public class Main
{
    public static void main(String[] args)
    {

        BoardFactory test1 = new BoardFactory();

        Cell[][] cells = test1.createBoard(10, 10);

        for (int i = 0; i < test1.getRows(); i++) {

            for (int j = 0; j < test1.getCols(); j++) {

                Cell cell = cells[i][j];

                if (cell.isAlivePresent()) {
                    System.out.print('X');
                } else {
                    System.out.print('O');
                }
            }

            System.out.println();
        }
    }
}
