package de.javacourse;

public class Main {

    public static void main(String[] args)
    {
        int rows = 10;
        int cols = 10;

	    GameController controller = new GameController(rows, cols);
        controller.startGame();
    }
}
