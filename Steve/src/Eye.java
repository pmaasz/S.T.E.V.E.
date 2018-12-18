import java.awt.*;

public class Eye
{
    private int xPos;

    private int yPos;

    private int width;

    private int height;

    private int curve = 30;

    private int radius = 2;

    private int counter = 0;

    private boolean blink = false;

    private Color color;

    public Eye(int xPos, int yPos, int width, int height, int curve, int radius, int counter)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.curve = curve;
        this.radius = radius;
        this.counter = counter;
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

    public int getHeightright()
    {
        return this.height;
    }

    public void setHeightright(int height)
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
        return curve;
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
