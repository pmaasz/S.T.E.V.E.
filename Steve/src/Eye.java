import java.awt.*;

public class Eye
{
    private int xPos;

    private int yPos;

    private int width;

    private int height;

    private int curve;

    private int radius;

    private int counter;

    private boolean blink = false;

    private Color color;

    public Eye(int xPos, int yPos, int width, int height)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.curve = 30;
        this.radius = 2;
        this.counter = 0;
        this.color = new Color(10, 200, 255);;
    }

    public int getXPos()
    {
        return this.xPos;
    }

    public void setXPos(int xPos)
    {
        this.xPos = xPos;
    }

    public int getYPos()
    {
        return this.yPos;
    }

    public void setYPos(int yPos)
    {
        this.yPos = yPos;
    }

    public int getWidth()
    {
        return this.width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setHeight(int height)
    {
        this.height = height;
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
        return this.curve;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getCounter()
    {
        return this.counter;
    }

    public void setCounter(int counter)
    {
        this.counter = counter;
    }

    public boolean isBlink()
    {
        return this.blink;
    }

    public void setBlink(boolean blink)
    {
        this.blink = blink;
    }
}