import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame
{
    private double mouseX;

    private double mouseY;

    private boolean click;

    private int counter = 0;

    protected DrawPanel drawPanel;

    public Frame(LeftEye leftEye, RightEye rightEye, Eyes eyes)
    {
        this.drawPanel = new DrawPanel(leftEye,  rightEye,  eyes);

        add(this.drawPanel);
        pack();
        setSize(300,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("S.T.E.V.E.");
        addMouseMotionListener(new KeyHandler());
        addMouseListener(new KeyHandler());
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void repaintDrawPanel()
    {
        this.drawPanel.repaint();
    }

    public double getMouseX()
    {
        return mouseX;
    }

    public double getMouseY()
    {
        return mouseY;
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
        return click;
    }

    public void setClick(boolean click)
    {
        this.click = click;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private class KeyHandler implements MouseMotionListener, MouseListener
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