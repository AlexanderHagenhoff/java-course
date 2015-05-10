package de.javacourse.gameoflife.controller;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.Cell;
import de.javacourse.gameoflife.model.NeighbourHelper;
import de.javacourse.gameoflife.model.rules.Rules;
import de.javacourse.gameoflife.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    private ExecutorService executor = Executors.newCachedThreadPool();

    public GameController(Board board, View view, Rules rules, NeighbourHelper neighbourHelper)
    {
        this.board = board;
        this.view = view;
        this.neighbourHelper = neighbourHelper;
        this.rules = rules;
    }

    public void startGame()
    {
        Runnable renderRunnable = new Runnable()
        {
            @Override
            public void run()
            {
                while (true) {
                    renderView();
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread renderThread = new Thread(renderRunnable);
        renderThread.start();

        while (true) {
            prepareNextGeneration();
            dumpFutureToPresent();

            generationCount++;

            Runnable printStatsRunnable = new Runnable() {
                @Override
                public void run()
                {
                    printStats();
                }
            };
            executor.execute(printStatsRunnable);
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
        int threadCountVertical = 3;
        int threadCountHorizontal = 4;

        int widthPerThread = board.getWidth() / threadCountHorizontal;
        int heightPerThread = board.getHeigth() / threadCountVertical;

        Collection<Callable<Boolean>> callables = new ArrayList<Callable<Boolean>>();

        for (int y = 0; y < threadCountVertical; y++) {
            for (int x = 0; x < threadCountHorizontal; x++) {
                Callable<Boolean> runnable = createCallable(
                    board, x * widthPerThread, y * heightPerThread, widthPerThread, heightPerThread
                );
                callables.add(runnable);
            }
        }

        try {
            executor.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


          /*
        for (int y = 0; y < board.getHeigth(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {

                Cell cell = board.getCell(x, y);

                int neighboursAlive = neighbourHelper.getNeighboursAliveCount(x, y);
                boolean isCellAliveFuture = rules.isAliveFuture(cell, neighboursAlive);

                cell.setAliveFuture(isCellAliveFuture);
            }
        }   */
    }

    private Callable<Boolean> createCallable(
        final Board board, final int xPos, final int yPos, final int width, final int height
    )
    {
        return new Callable<Boolean>()
        {
            @Override
            public Boolean call()
            {
                for (int y = yPos; y < yPos + height; y++) {
                    for (int x = xPos; x < xPos + width; x++) {
                        Cell cell = board.getCell(x, y);

                        if (cell != null) {
                            int neighboursAlive = neighbourHelper.getNeighboursAliveCount(x, y);
                            boolean isCellAliveFuture = rules.isAliveFuture(cell, neighboursAlive);

                            cell.setAliveFuture(isCellAliveFuture);
                        }
                    }
                }
                return true;
            }
        };
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
