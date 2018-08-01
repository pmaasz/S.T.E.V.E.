public class Steve {

    public static void main (String[] args)
    {
        Eyes eyes = new Eyes();
        LeftEye leftEye = new LeftEye();
        RightEye rightEye = new RightEye();
        Repo repo = new Repo();
        Frame frame = new Frame(leftEye,  rightEye,  eyes);

        while(true)
        {
            //moving up
            repo.movingUp(leftEye, rightEye, frame);

            //moving down
            repo.movingDown(leftEye, rightEye, frame);

            //moving right
            repo.movingRight(leftEye, rightEye, frame);

            //moving left
            repo.movingLeft(leftEye, rightEye, frame);

            //resizing height
            repo.resizeHeight(leftEye, rightEye);

            //resizing width
            repo.resizeWidth(leftEye, rightEye);

            //looking angry
            repo.angry(frame, eyes);

            //blinking
            repo.blink(eyes, frame);

            //boundaries
            repo.boundaries(leftEye, rightEye);

            //repainting the JPanel
            frame.repaintDrawPanel();

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
