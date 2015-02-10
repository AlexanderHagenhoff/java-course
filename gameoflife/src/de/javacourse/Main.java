package de.javacourse;

public class Main {

    public static void main(String[] args)
    {
        int width = 10;
        int height = 11;

        GameController controller = new GameController(width, height);
        controller.startGame();
    }
}
