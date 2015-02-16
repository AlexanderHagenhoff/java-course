package de.javacourse;

public class GameController
{
    private final NeighbourHelper neighbourHelper;

    private final Rules rules;

    private final Board board;
    private final View view;

    public GameController(Board board, View view, Rules rules, NeighbourHelper neighbourHelper)
    {
        this.board = board;
        this.view = view;
        this.neighbourHelper = neighbourHelper;
        this.rules = rules;
        this.neighbourHelper.setBordersAreLimiting(rules.getBordersAreLimiting());
    }

    public void startGame()
    {
        renderView();
        prepareNextGeneration();
    }

    private void prepareNextGeneration()
    {
        for (int y = 0; y < board.getHeigth(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                int neighboursAlive = neighbourHelper.getNeighboursAliveCount(x, y, board);
                boolean cellIsAliveFuture = rules.isAliveFuture(board.getCell(x, y), neighboursAlive);
                board.getCell(x, y).setAliveFuture(cellIsAliveFuture);
            }
        }
    }

    private void renderView()
    {
        view.render(board);
    }
}
