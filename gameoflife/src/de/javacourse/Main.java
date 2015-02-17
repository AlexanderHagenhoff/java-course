package de.javacourse;

import de.javacourse.rules.Rule;

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
