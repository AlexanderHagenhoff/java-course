package de.javacourse;

public class GameController
{
    private Board board;
    private ConsoleView view;

    public GameController(int rows, int cols)
    {
        BoardFactory boardFactory = new BoardFactory();

        board = boardFactory.createBoard(rows, cols);

        view = new ConsoleView();
    }

    public void startGame()
    {
        renderView();
    }

    private void renderView()
    {
        view.printBoardToConsole(board);
    }
}
