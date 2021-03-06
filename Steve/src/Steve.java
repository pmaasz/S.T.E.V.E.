public class Steve extends Thread
{
    private Eye rightEye;

    private Eye leftEye;

    private Repo repo;

    private Frame frame;

    private DrawPanel drawPanel;

    public static int SLEEP_COUNTER = 0;

    /**
     * Steve Constructor
     */
    public Steve()
    {
        this.rightEye = new Eye(155, 40, 80, 90);
        this.leftEye = new Eye(55, 40, 80, 90);
        this.repo = new Repo();
        this.drawPanel = new DrawPanel(this.leftEye, this.rightEye);
        this.frame = new Frame(this.drawPanel);
    }

    synchronized private void movement()
    {
        boolean runVariable = true;

        while(runVariable)
        {
            //moving up
            this.repo.movingUp(this.leftEye, this.rightEye, this.frame);

            //moving down
            this.repo.movingDown(this.leftEye, this.rightEye, this.frame);

            //moving right
            this.repo.movingRight(this.leftEye, this.rightEye, this.frame);

            //moving left
            this.repo.movingLeft(this.leftEye, this.rightEye, this.frame);

            //resizing height
            this.repo.resizeHeight(this.leftEye, this.rightEye);

            //resizing width
            this.repo.resizeWidth(this.leftEye, this.rightEye);

            //looking angry
            this.repo.angry(this.frame, this.leftEye, this.rightEye);

            //blinking
            this.repo.blink(this.leftEye, this.rightEye, this.frame);

            //boundaries
            this.repo.boundaries(this.leftEye, this.rightEye);

            //repainting the JPanel
            this.frame.repaintDrawPanel();

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            SLEEP_COUNTER++;

            if(SLEEP_COUNTER > 5000)
            {
               this.repo.sleep(this.leftEye, this.rightEye);
            }
        }
    }

    @Override
    public void run()
    {
        this.movement();
    }
}