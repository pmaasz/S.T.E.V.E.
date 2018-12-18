import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame
{
    private double mouseX;

    private double mouseY;

    private boolean click;

    private int counter = 0;

    private int clickCounter = 0;

    protected DrawPanel drawPanel;

    /**
     * GraphicsEnvironment is the Environment in which the window is placed
     * @param leftEye
     * @param rightEye
     */
    public Frame(Eye leftEye, Eye rightEye)
    {
        this.drawPanel = new DrawPanel(leftEye,  rightEye);

        add(this.drawPanel);
        pack();
        setSize(300,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("S.T.E.V.E.");
        addMouseMotionListener(new MouseHandler());
        addMouseListener(new MouseHandler());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void repaintDrawPanel()
    {
        this.drawPanel.repaint();
    }

    public double getMouseX()
    {
        return this.mouseX;
    }

    public double getMouseY()
    {
        return this.mouseY;
    }

    public void setMouseX(double mouseX)
    {
        this.mouseX = mouseX;
    }

    public void setMouseY(double mouseY)
    {
        this.mouseY = mouseY;
    }

    public boolean isClick()
    {
        return this.click;
    }

    public void setClick(boolean click)
    {
        this.click = click;
    }

    public int getCounter()
    {
        return this.counter;
    }

    public void setCounter(int counter)
    {
        this.counter = counter;
    }

    public int getClickCounter()
    {
        return this.clickCounter;
    }

    public void setClickCounter(int clickCounter)
    {
        this.clickCounter = clickCounter;
    }

    private class MouseHandler implements MouseMotionListener, MouseListener
    {
        @Override
        public void mouseDragged(MouseEvent e) { }

        @Override
        public void mouseMoved(MouseEvent e)
        {
            setMouseX(e.getX());
            setMouseY(e.getY());
        }

        @Override
        public void mouseClicked(MouseEvent e) { }

        @Override
        public void mousePressed(MouseEvent e)
        {
            setClick(true);
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            setClick(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) { }

        @Override
        public void mouseExited(MouseEvent e) { }
    }
}