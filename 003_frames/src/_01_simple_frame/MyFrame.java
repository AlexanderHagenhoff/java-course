package _01_simple_frame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyFrame extends JFrame
{
    private List<Circle> circles = new ArrayList<>();

    public MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1024, 768);
    }

    @Override
    public void paint(Graphics g){
        for (Circle circle : circles) {
            circle.paint(g);
        }
    }

    public void add(Circle circle)
    {
        circles.add(circle);
    }
}
