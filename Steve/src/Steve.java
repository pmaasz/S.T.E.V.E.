public class Steve
{
    //private Eyes eyes;

    //private LeftEye leftEye;

    //private RightEye rightEye;

    private Eye rightEye;

    private Eye leftEye;

    private Repo repo;

    private Frame frame;

    Steve()
    {
        this.rightEye = new Eye(155, 40, 80, 90);
        this.leftEye = new Eye(55, 40, 80, 90);
        this.repo = new Repo();
        this.frame = new Frame(leftEye,  rightEye);
    }

    public static void main (String[] args)
    {
        Steve steve = new Steve();

        while(true)
        {
            //moving up
            steve.repo.movingUp(steve.leftEye, steve.rightEye, steve.frame);

            //moving down
            steve.repo.movingDown(steve.leftEye, steve.rightEye, steve.frame);

            //moving right
            steve.repo.movingRight(steve.leftEye, steve.rightEye, steve.frame);

            //moving left
            steve.repo.movingLeft(steve.leftEye, steve.rightEye, steve.frame);

            //resizing height
            steve.repo.resizeHeight(steve.leftEye, steve.rightEye);

            //resizing width
            steve.repo.resizeWidth(steve.leftEye, steve.rightEye);

            //looking angry
            steve.repo.angry(steve.frame, steve.eyes);

            //blinking
            steve.repo.blink(steve.leftEye, steve.rightEye, steve.frame);

            //boundaries
            steve.repo.boundaries(steve.leftEye, steve.rightEye);

            //repainting the JPanel
            steve.frame.repaintDrawPanel();

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}