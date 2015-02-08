package de.javacourse;

public class Main {

    public static void main(String[] args) {

    Board board1;

   BoardFactory boardFactory= new BoardFactory();
        board1= boardFactory.createBoard(10,10);

   ConsoleView consoleView = new ConsoleView();
        consoleView.showBoard(board1);

    }

}

