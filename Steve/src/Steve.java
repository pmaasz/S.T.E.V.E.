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
            //resizing height
            if((leftEye.getLeftYPos() > 90 || leftEye.getLeftYPos() < 30) && (rightEye.getRightYPos() > 90 || rightEye.getRightYPos() < 30))
            {
                rightEye.setHeightright(70);
                leftEye.setHeightleft(70);
                //frame.repaintDrawPanel();

            } else {
                leftEye.setHeightleft(90);
                rightEye.setHeightright(90);
                //frame.repaintDrawPanel();
            }

            //upper boundary
            if(leftEye.getLeftYPos() > 110)
            {
                leftEye.setLeftYPos(110);
                //frame.repaintDrawPanel();
            }

            if(rightEye.getRightYPos() > 110)
            {
                rightEye.setRightYPos(110);
                //frame.repaintDrawPanel();
            }

            //lower boundary
            if(leftEye.getLeftYPos() < 10)
            {
                leftEye.setLeftYPos(10);
                //frame.repaintDrawPanel();
            }

            if(rightEye.getRightYPos() < 10)
            {
                rightEye.setRightYPos(10);
                //frame.repaintDrawPanel();
            }

            //moving up
            if(leftEye.getLeftYPos() < frame.getMouseY() && rightEye.getRightYPos() < frame.getMouseY())
            {
                int leftYPos = leftEye.getLeftYPos();
                int rightYPos = rightEye.getRightYPos();
                leftYPos++;
                rightYPos++;
                leftEye.setLeftYPos(leftYPos);
                rightEye.setRightYPos(rightYPos);
                //frame.repaintDrawPanel();
            }

            //moving down
            if(leftEye.getLeftYPos() > frame.getMouseY() && rightEye.getRightYPos() > frame.getMouseY())
            {
                int leftYPos = leftEye.getLeftYPos();
                int rightYPos = rightEye.getRightYPos();
                leftYPos--;
                rightYPos--;
                leftEye.setLeftYPos(leftYPos);
                rightEye.setRightYPos(rightYPos);
                //frame.repaintDrawPanel();
            }

            //resizing width
            if(leftEye.getLeftXPos() < 25)
            {
                leftEye.setWidthleft(70);
                //frame.repaintDrawPanel();
            } else {
                leftEye.setWidthleft(80);
                //frame.repaintDrawPanel();
            }

            if(rightEye.getRightXPos() > 200)
            {
                rightEye.setWidthright(70);
                //frame.repaintDrawPanel();
            } else {
                rightEye.setWidthright(80);
                //frame.repaintDrawPanel();
            }

            //left boundary
            if(leftEye.getLeftXPos() < 10)
            {
                leftEye.setLeftXPos(10);
                //frame.repaintDrawPanel();
            }

            if(rightEye.getRightXPos() < 110)
            {
                rightEye.setRightXPos(110);
                //frame.repaintDrawPanel();
            }

            //right boundary
            if(leftEye.getLeftXPos() > 110)
            {
                leftEye.setLeftXPos(110);
                //frame.repaintDrawPanel();
            }

            if(rightEye.getRightXPos() > 210)
            {
                rightEye.setRightXPos(210);
                //frame.repaintDrawPanel();
            }

            //moving right
            if(leftEye.getLeftXPos() < frame.getMouseX() && rightEye.getRightXPos() < frame.getMouseX())
            {
                int leftXPos = leftEye.getLeftXPos();
                int rightXPos = rightEye.getRightXPos();
                leftXPos++;
                rightXPos++;
                leftEye.setLeftXPos(leftXPos);
                rightEye.setRightXPos(rightXPos);
                //frame.repaintDrawPanel();
            }

            //moving left
            if(leftEye.getLeftXPos() > frame.getMouseX() && rightEye.getRightXPos() > frame.getMouseX())
            {
                int leftXPos = leftEye.getLeftXPos();
                int rightXPos = rightEye.getRightXPos();
                leftXPos--;
                rightXPos--;
                leftEye.setLeftXPos(leftXPos);
                rightEye.setRightXPos(rightXPos);
                //frame.repaintDrawPanel();
            }

            //looking angry
            repo.angry(frame, eyes);

            //blinking
            repo.blink(eyes, frame);

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
