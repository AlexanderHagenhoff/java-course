package de.javacourse.gameoflife.controller;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.Cell;
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
        while(true) {
            renderView();

            prepareNextGeneration();
            dumpFutureToPresent();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void prepareNextGeneration()
    {
        for (int y = 0; y < board.getHeigth(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {

                Cell cell = board.getCell(x, y);

                int neighboursAlive = neighbourHelper.getNeighboursAliveCount(x, y);
                boolean isCellAliveFuture = rules.isAliveFuture(cell, neighboursAlive);

                cell.setAliveFuture(isCellAliveFuture);
            }
        }
    }

    private void dumpFutureToPresent()
    {
        for (int y = 0; y < board.getHeigth(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {

                Cell cell = board.getCell(x, y);

                cell.setAlivePresent(cell.isAliveFuture());
            }
        }
    }

    private void renderView()
    {
        view.render(board);
    }
}
