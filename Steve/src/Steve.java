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
            int counter = 0;
/*
            //LeftEye-boundaries
            if(leftEye.getLeftYPos() < 10) leftEye.setLeftYPos(10);
            if(leftEye.getLeftYPos() > 110) leftEye.setLeftYPos(110);
            if(leftEye.getLeftXPos() < 10) leftEye.setLeftXPos(10);
            if(leftEye.getLeftXPos() > 110) leftEye.setLeftXPos(110);

            //RightEye-boundaries
            if(rightEye.getRightYPos() < 10) rightEye.setRightYPos(10);
            if(rightEye.getRightYPos() > 110) rightEye.setRightYPos(110);
            if(rightEye.getRightXPos() < 10) rightEye.setRightXPos(110);
            if(rightEye.getRightXPos() > 110) rightEye.setRightYPos(10);
*/
            //resizing height
            if((leftEye.getLeftYPos() > 90 || leftEye.getLeftYPos() < 30) && (rightEye.getRightYPos() > 90 || rightEye.getRightYPos() < 30))
            {
                rightEye.setHeightright(70);
                leftEye.setHeightleft(70);
                frame.repaintDrawPanel();

            } else {
                leftEye.setHeightleft(90);
                rightEye.setHeightright(90);
                frame.repaintDrawPanel();
            }
/*
            //has to be dependent of the right eye xpos
            if(leftEye.getRightXPos() > 100)
            {
                rightEye.setWidthright(70);
            } else {
                rightEye.setWidthright(80);
            }

            //has to be dependent of the left eye xpos
            if(leftEye.getLeftXPos() < 25)
            {
                leftEye.setLeftXPos(70);
            } else {
                leftEye.setLeftXPos(80);
            }
*/
            //moving up
            if(leftEye.getLeftYPos() < frame.getMouseY() && rightEye.getRightYPos() < frame.getMouseY())
            {
                int leftYPos = leftEye.getLeftYPos();
                int rightYPos = rightEye.getRightYPos();
                leftYPos++;
                rightYPos++;
                leftEye.setLeftYPos(leftYPos);
                rightEye.setRightYPos(rightYPos);
                frame.repaintDrawPanel();
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
                frame.repaintDrawPanel();
            }
/*
            //moving right
            if(leftEye.getLeftXPos() < frame.getMouseX() && rightEye.getRightXPos() < frame.getMouseX())
            {
                int leftXPos = leftEye.getLeftXPos();
                int rightXPos = rightEye.getRightXPos();
                leftXPos++;
                rightXPos++;
                leftEye.setLeftXPos(leftXPos);
                rightEye.setRightXPos(rightXPos);
                frame.repaintDrawPanel();
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
                frame.repaintDrawPanel();
            }
*/
            //blinking
            repo.blink(eyes, counter);

            //looking angry
            if(frame.isClick())
            {
                eyes.setColor(255,30,30);
            } else {
                eyes.setColor(10, 200, 255);
            }

            frame.repaintDrawPanel();

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
