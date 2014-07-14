package _01_simple_frame;

import java.awt.*;

public class Circle
{
    private int x = 0;

    private int y = 0;

    private int width = 100;

    private Color color = Color.BLACK;

    public Circle(int x, int y, int width)
    {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void paint(Graphics g)
    {
        Color tmpColor = g.getColor();

        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.width);

        g.setColor(tmpColor);
    }
}
