import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame
{

    protected int leftxpos = 55;
    protected int leftypos = 40;
    protected int widthleft = 80;
    protected int heightleft = 90;
    protected int widthright = 80;
    protected int heightright = 90;
    protected int curve = 30;
    protected int dotx = 1;
    protected int doty = 230;
    protected int radius = 2;
    protected int red = 10;
    protected int green = 180;
    protected int blue = 255;
    protected int counter = 0;
    protected boolean blink = false;
    protected double mouseX;
    protected double mouseY;
    protected boolean click;
    public Color c;

    DrawPanel drawPanel = new DrawPanel();

    public Frame()
    {
        add(drawPanel);
        pack();
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("S.T.E.V.E.");
        addMouseMotionListener(new KeyHandler());
        addMouseListener(new KeyHandler());
    }

    public void repaintDrawPanel()
    {
        drawPanel.repaint();
    }

    public double getMouseX()
    {
        return mouseX;
    }

    public double getMouseY()
    {
        return mouseY;
    }

    private class KeyHandler implements MouseMotionListener, MouseListener
    {

        @Override
        public void mouseDragged(MouseEvent e) { }

        @Override
        public void mouseMoved(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();
        }

        @Override
        public void mouseClicked(MouseEvent e) { }

        @Override
        public void mousePressed(MouseEvent e) {
            click = true;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            click = false;
        }

        @Override
        public void mouseEntered(MouseEvent e) { }

        @Override
        public void mouseExited(MouseEvent e) { }
    }

    public class DrawPanel extends JPanel
    {

        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D)g;

            //Background
            g2.setColor(Color.BLACK);
            g2.fillRect(0, 0, getWidth(), getHeight());

            //Blink
            if (blink)
            {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(c);
            }

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Left
            g2.drawRoundRect(leftxpos,leftypos, widthleft, heightleft, curve, curve);
            g2.fillRoundRect(leftxpos,leftypos, widthleft, heightleft, curve, curve);

            //Right
            g2.drawRoundRect(leftxpos +100,leftypos, widthright, heightright, curve, curve);
            g2.fillRoundRect(leftxpos +100,leftypos, widthright, heightright, curve, curve);

            //Visualizer
            Color c2 = new Color(red, green, blue);

            g2.setColor(c2);
            g2.drawOval(dotx, doty, radius, radius);
            g2.fillOval(dotx, doty, radius, radius);
            g2.drawOval(dotx+5, doty, radius, radius);
            g2.fillOval(dotx+5, doty, radius, radius);
        }
    }
}
