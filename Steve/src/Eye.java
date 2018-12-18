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

    public Eye(int xPos, int yPos, int width, int height, int curve, int radius, int counter, Color color)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        
    }


}
