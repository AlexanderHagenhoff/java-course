package de.javacourse.gameoflife.controller;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.NeighbourHelper;
import de.javacourse.gameoflife.model.rules.Rules;
import de.javacourse.gameoflife.view.View;

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
