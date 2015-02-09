package de.javacourse;

public class GameController
{
    private int rows;
    private int cols;

    private Board board;
    private ConsoleView view;

    public GameController(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;

        BoardFactory boardFactory = new BoardFactory();

        board = boardFactory.createBoard(this.rows, this.cols).getBoard();

        view = new ConsoleView();
    }

    public void startGame()
    {
        renderView();
    }

    private void renderView()
    {
        view.printBoardToConsole(board, rows, cols);
    }
}
