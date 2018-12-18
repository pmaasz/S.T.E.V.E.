import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel
{
    private Eye leftEye;

    private Eye rightEye;

    public DrawPanel(Eye leftEye, Eye rightEye)
    {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        Color color = new Color(0, 0, 0, 255);

        g2.setColor(color);
        g2.fillRect(0, 0, getWidth(), getHeight());

        //Blink
        if (this.rightEye.isBlink() && this.leftEye.isBlink())
        {
            g.setColor(this.leftEye.getColor());
            //g.setColor();
        } else {
            g.setColor(this.leftEye.getColor());
        }

        //Left
        g2.drawRoundRect(this.leftEye.getXPos(),this.leftEye.getYPos(), this.leftEye.getWidth(), this.leftEye.getHeight(), this.leftEye.getCurve(), this.leftEye.getCurve());
        g2.fillRoundRect(this.leftEye.getXPos(),this.leftEye.getYPos(), this.leftEye.getWidth(), this.leftEye.getHeight(), this.leftEye.getCurve(), this.leftEye.getCurve());

        //Right
        g2.drawRoundRect(this.rightEye.getXPos(),this.rightEye.getYPos(), this.rightEye.getWidth(), this.rightEye.getHeight(), this.leftEye.getCurve(), this.leftEye.getCurve());
        g2.fillRoundRect(this.rightEye.getXPos(),this.rightEye.getYPos(), this.rightEye.getWidth(), this.rightEye.getHeight(), this.leftEye.getCurve(), this.leftEye.getCurve());
    }
}
