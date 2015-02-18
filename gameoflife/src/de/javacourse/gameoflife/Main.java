package de.javacourse.gameoflife;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.BoardFactory;
import de.javacourse.gameoflife.controller.GameController;
import de.javacourse.gameoflife.model.NeighbourHelper;
import de.javacourse.gameoflife.view.View;
import de.javacourse.gameoflife.model.rules.Rule;
import de.javacourse.gameoflife.model.rules.Rules;
import de.javacourse.gameoflife.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

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


        List<Rule> rules = new ArrayList<Rule>();
        Rules rule= new Rules(rules);

        GameController controller = new GameController(board, view, rule, neighbourHelper);
        controller.startGame();
    }
}
