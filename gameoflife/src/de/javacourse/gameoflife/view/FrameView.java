package de.javacourse.gameoflife.view;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.Cell;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.*;

public class FrameView implements View
{
    private static final int SCALE_FACTOR = 4;

    private JFrame frame;

    public FrameView()
    {
        initFrame();
    }

    @Override
    public void render(Board board)
    {
        Graphics g = frame.getContentPane().getGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, frame.getWidth(), frame.getHeight());

        g.setColor(Color.white);

        int height = board.getHeigth();
        int width = board.getWidth();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Cell cell = board.getCell(x, y);
                if (cell.isAlivePresent()) {
                    g.fillRect(x * SCALE_FACTOR, y * SCALE_FACTOR, SCALE_FACTOR, SCALE_FACTOR);
                }
            }
        }
    }

    private void initFrame()
    {
        frame = new JFrame();

        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("game of life");
        frame.getContentPane().setBackground(Color.black);

        frame.setVisible(true);
    }
}
