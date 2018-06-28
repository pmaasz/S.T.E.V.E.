import java.awt.*;

public class Eyes
{
    private int leftXPos = 55;

    private int leftYPos = 40;

    private int widthleft = 80;

    private int heightleft = 90;

    private int widthright = 80;

    private int heightright = 90;

    private int curve = 30;

    private int dotx = 1;

    private int doty = 230;

    private int radius = 2;

    private int red = 10;

    private int green = 180;

    private int blue = 255;

    private int counter = 0;

    private boolean blink = false;

    private double mouseX;

    private double mouseY;

    private boolean click;

    private Color c;

    public Eyes()
    {
    }

    public int getCurve() {
        return curve;
    }

    public void setCurve(int curve) {
        this.curve = curve;
    }

    public int getDotx() {
        return dotx;
    }

    public void setDotx(int dotx) {
        this.dotx = dotx;
    }

    public int getDoty() {
        return doty;
    }

    public void setDoty(int doty) {
        this.doty = doty;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isBlink() {
        return blink;
    }

    public void setBlink(boolean blink) {
        this.blink = blink;
    }

    public double getMouseX() {
        return mouseX;
    }

    public void setMouseX(double mouseX) {
        this.mouseX = mouseX;
    }

    public double getMouseY() {
        return mouseY;
    }

    public void setMouseY(double mouseY) {
        this.mouseY = mouseY;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}