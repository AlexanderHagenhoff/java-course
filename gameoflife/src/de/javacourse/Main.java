package de.javacourse;

public class Main
{
    public static void main(String[] args)
    {
        int width = 20;
        int height = 20;

        View view = new ConsoleView();

        BoardFactory boardFactory = new BoardFactory();
        Board board = boardFactory.createBoard(width, height);

        NeighbourHelper neighbourHelper = new NeighbourHelper();
        Rules rules = new RuleSetDefault();
        neighbourHelper.setBordersAreLimiting(rules.getBordersAreLimiting());

        GameController controller = new GameController(board, view, rules, neighbourHelper);
        controller.startGame();
    }
}
