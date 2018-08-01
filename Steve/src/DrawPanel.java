import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel
{
    private LeftEye leftEye;

    private RightEye rightEye;

    private Eyes eyes;

    public DrawPanel(LeftEye leftEye, RightEye rightEye, Eyes eyes)
    {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.eyes = eyes;

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;

        //Background
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());

        //Blink
        if (this.eyes.isBlink())
        {
            g.setColor(this.eyes.getColor());
        } else {
            g.setColor(this.eyes.getColor());
        }

        //Left
        g2.drawRoundRect(this.leftEye.getLeftXPos(),this.leftEye.getLeftYPos(), this.leftEye.getWidthleft(), this.leftEye.getHeightleft(), this.eyes.getCurve(), this.eyes.getCurve());
        g2.fillRoundRect(this.leftEye.getLeftXPos(),this.leftEye.getLeftYPos(), this.leftEye.getWidthleft(), this.leftEye.getHeightleft(), this.eyes.getCurve(), this.eyes.getCurve());

        //Right
        g2.drawRoundRect(this.rightEye.getRightXPos(),this.rightEye.getRightYPos(), this.rightEye.getWidthright(), this.rightEye.getHeightright(), this.eyes.getCurve(), this.eyes.getCurve());
        g2.fillRoundRect(this.rightEye.getRightXPos(),this.rightEye.getRightYPos(), this.rightEye.getWidthright(), this.rightEye.getHeightright(), this.eyes.getCurve(), this.eyes.getCurve());
    }
}
