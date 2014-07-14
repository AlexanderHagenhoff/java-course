package _01_simple_frame;

import java.awt.*;

public class Application
{
    public static void main(String[] args)
    {
        new Application();
    }

    public Application()
    {
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);

        Circle circle = new Circle(100, 100, 30);
        circle.setColor(Color.red);
        myFrame.add(circle);

        myFrame.repaint();
    }
}
