public class EyesRepository
{
    private LeftEye leftEye;

    private RightEye rightEye;

    public EyesRepository(LeftEye leftEye, RightEye rightEye)
    {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
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