import java.awt.*;

public class Eyes
{
    private int curve = 30;

    private int radius = 2;

    private int counter = 0;

    private boolean blink = false;

    private Color color;

    public Eyes()
    {
        this.color = new Color(10, 200, 255);
    }

    public Color getColor()
    {
        return this.color;
    }

    public void setColor(int r , int g, int b)
    {
        this.color = new Color(r , g, b);
    }

    public int getCurve()
    {
        return curve;
    }

    public void setCurve(int curve)
    {
        this.curve = curve;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getCounter()
    {
        return counter;
    }

    public void setCounter(int counter)
    {
        this.counter = counter;
    }

    public boolean isBlink()
    {
        return blink;
    }

    public void setBlink(boolean blink)
    {
        this.blink = blink;
    }
}