package de.javacourse.gameoflife.controller;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.Cell;
import de.javacourse.gameoflife.model.NeighbourHelper;
import de.javacourse.gameoflife.model.rules.Rules;
import de.javacourse.gameoflife.view.View;

import static java.lang.String.*;

public class GameController
{
    public static final int STAT_PRINT_GENERATION_STEP = 10;

    private final NeighbourHelper neighbourHelper;

    private final Rules rules;

    private final Board board;

    private final View view;

    private long generationCount = 0;

    private long lastUpdateMillis = System.currentTimeMillis();

    public GameController(Board board, View view, Rules rules, NeighbourHelper neighbourHelper)
    {
        this.board = board;
        this.view = view;
        this.neighbourHelper = neighbourHelper;
        this.rules = rules;
    }

    public void startGame()
    {
        while (true) {

            renderView();


            prepareNextGeneration();
            dumpFutureToPresent();

            generationCount++;
            printStats();
        }
    }

    private void printStats()
    {
        if (generationCount % STAT_PRINT_GENERATION_STEP == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long duration = currentTimeMillis - lastUpdateMillis;
            long generationDuration = duration / STAT_PRINT_GENERATION_STEP;
            lastUpdateMillis = currentTimeMillis;

            String message = format(
                "Generation: %d, Duration: %dms, GenerationDuration: %dms",
                generationCount,
                duration,
                generationDuration
            );
            System.out.println(message);
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
