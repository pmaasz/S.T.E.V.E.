import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel
{
    private LeftEye leftEye;

    private RightEye rightEye;

    private Eyes eyes;

    public DrawPanel()
    {
        this.leftEye = new LeftEye();
        this.rightEye = new RightEye();
        this.eyes = new Eyes();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;

        //Background
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());

        //Blink
        if (eyes.isBlink())
        {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(eyes.getColor());
        }

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Left
        g2.drawRoundRect(leftEye.getLeftXPos(),leftEye.getLeftYPos(), leftEye.getWidthleft(), leftEye.getHeightleft(), eyes.getCurve(), eyes.getCurve());
        g2.fillRoundRect(leftEye.getLeftXPos(),leftEye.getLeftYPos(), leftEye.getWidthleft(), leftEye.getHeightleft(), eyes.getCurve(), eyes.getCurve());

        //Right
        g2.drawRoundRect(rightEye.getRightXPos(),rightEye.getRightYPos(), rightEye.getWidthright(), rightEye.getHeightright(), eyes.getCurve(), eyes.getCurve());
        g2.fillRoundRect(rightEye.getRightXPos(),rightEye.getRightYPos(), rightEye.getWidthright(), rightEye.getHeightright(), eyes.getCurve(), eyes.getCurve());
    }
}
