package de.javacourse.gameoflife.view;

import de.javacourse.gameoflife.model.Board;
import de.javacourse.gameoflife.model.Cell;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.*;

public class FrameView implements View
{
    private static final int SCALE_FACTOR = 1;

    private JFrame frame;

    private Image offscreenImage;

    public FrameView()
    {
        initFrame();
        offscreenImage = frame.createImage(this.getWidth(), this.getHeight());
    }

    @Override
    public void render(Board board)
    {
        Graphics g = offscreenImage.getGraphics();
        //Graphics g = frame.getContentPane().getGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

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

        Graphics onScreenGraphics = frame.getContentPane().getGraphics();

        onScreenGraphics.drawImage(offscreenImage, 0, 0, frame);
    }

    @Override
    public int getWidth()
    {
        return frame.getWidth();
    }

    @Override
    public int getHeight()
    {
        return frame.getHeight();
    }

    private void initFrame()
    {
        frame = new JFrame();

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("game of life");
        frame.getContentPane().setBackground(Color.black);

        frame.setVisible(true);
    }
}
