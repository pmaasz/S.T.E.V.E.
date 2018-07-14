public class SteveRepository
{
    private Frame frame;

    private Eyes eyes;

    private LeftEye leftEye;

    private RightEye rightEye;

    private Dot dot;

    public SteveRepository (Frame frame, Eyes eyes, Dot dot, LeftEye leftEye, RightEye rightEye)
    {
        this.frame = new Frame();
        this.eyes = new Eyes();
        this.dot = new Dot();
        this.leftEye = new LeftEye();
        this.rightEye = new RightEye();
    }

    public void EyesmoveY(int leftY, int rightY)
    {
        this.leftEye.setLeftYPos(leftY);
        this.rightEye.setRightYPos(rightY);
    }

    public void EyesmoveX(int leftX, int rightX)
    {
        this.leftEye.setLeftXPos(leftX);
        this.rightEye.setRightXPos(rightX);
    }

    public void EyeResize(LeftEye leftEye, RightEye rightEye)
    {

    }
}