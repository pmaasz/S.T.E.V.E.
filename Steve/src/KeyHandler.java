import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class KeyHandler implements MouseMotionListener, MouseListener
{
    private Frame frame;

    public KeyHandler()
    {
        this.frame = new Frame();
    }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        frame.setMouseX(e.getX());
        frame.setMouseY(e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mousePressed(MouseEvent e)
    {
        frame.setClick(true);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        frame.setClick(false);
    }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }
}
