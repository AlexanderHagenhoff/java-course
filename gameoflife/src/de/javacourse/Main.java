package de.javacourse;

public class Main
{
    public static void main(String[] args)
    {
        int width = 20;
        int height = 21;

        View view = new ConsoleView();

        BoardFactory boardFactory = new BoardFactory();
        Board board = boardFactory.createBoard(width, height);

        NeighbourHelper neighbourHelper = new NeighbourHelper();
        Rules rules = new Rules();

        GameController controller = new GameController(board, view, rules, neighbourHelper);
        controller.startGame();
    }
}
