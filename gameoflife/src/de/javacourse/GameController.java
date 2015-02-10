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
    }

    public void startGame()
    {
        renderView();
    }

    private void renderView()
    {
        view.render(board);
    }
}
