package de.javacourse.gameoflife;

import de.javacourse.gameoflife.controller.GameController;
import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.BoardFactory;
import de.javacourse.gameoflife.model.NeighbourHelper;
import de.javacourse.gameoflife.model.rules.CellAliveNotTwoOrThreeNeighboursAliveRule;
import de.javacourse.gameoflife.model.rules.CellAliveThreeNeighboursAliveRule;
import de.javacourse.gameoflife.model.rules.CellAliveTwoNeighboursAliveRule;
import de.javacourse.gameoflife.model.rules.CellDeadNotThreeNeighboursAliveRule;
import de.javacourse.gameoflife.model.rules.CellDeadThreeNeighboursAliveRule;
import de.javacourse.gameoflife.model.rules.Rule;
import de.javacourse.gameoflife.model.rules.Rules;
import de.javacourse.gameoflife.view.FrameView;
import de.javacourse.gameoflife.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        View view = new FrameView();

        int width = view.getWidth();
        int height = view.getHeight();

        BoardFactory boardFactory = new BoardFactory();
        Board board = boardFactory.createBoard(width, height);

        NeighbourHelper neighbourHelper = new NeighbourHelper(board);

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new CellAliveThreeNeighboursAliveRule());
        rules.add(new CellAliveTwoNeighboursAliveRule());
        rules.add(new CellAliveNotTwoOrThreeNeighboursAliveRule());
        rules.add(new CellDeadThreeNeighboursAliveRule());
        rules.add(new CellDeadNotThreeNeighboursAliveRule());
        Rules rule = new Rules(rules);

        GameController controller = new GameController(board, view, rule, neighbourHelper);
        controller.startGame();
    }
}
