public class Repo
{
    public void movingUp(LeftEye leftEye, RightEye rightEye, Frame frame)
    {
        if(leftEye.getLeftYPos() < frame.getMouseY() && rightEye.getRightYPos() < frame.getMouseY())
        {
            int leftYPos = leftEye.getLeftYPos();
            int rightYPos = rightEye.getRightYPos();
            leftYPos++;
            rightYPos++;
            leftEye.setLeftYPos(leftYPos);
            rightEye.setRightYPos(rightYPos);
        }
    }

    public void movingDown(LeftEye leftEye, RightEye rightEye, Frame frame)
    {
        if(leftEye.getLeftYPos() > frame.getMouseY() && rightEye.getRightYPos() > frame.getMouseY())
        {
            int leftYPos = leftEye.getLeftYPos();
            int rightYPos = rightEye.getRightYPos();
            leftYPos--;
            rightYPos--;
            leftEye.setLeftYPos(leftYPos);
            rightEye.setRightYPos(rightYPos);
        }
    }

    public void movingRight(LeftEye leftEye, RightEye rightEye, Frame frame)
    {
        if(leftEye.getLeftXPos() < frame.getMouseX() && rightEye.getRightXPos() < frame.getMouseX())
        {
            int leftXPos = leftEye.getLeftXPos();
            int rightXPos = rightEye.getRightXPos();
            leftXPos++;
            rightXPos++;
            leftEye.setLeftXPos(leftXPos);
            rightEye.setRightXPos(rightXPos);
        }
    }

    public void movingLeft(LeftEye leftEye, RightEye rightEye, Frame frame)
    {
        if(leftEye.getLeftXPos() > frame.getMouseX() && rightEye.getRightXPos() > frame.getMouseX())
        {
            int leftXPos = leftEye.getLeftXPos();
            int rightXPos = rightEye.getRightXPos();
            leftXPos--;
            rightXPos--;
            leftEye.setLeftXPos(leftXPos);
            rightEye.setRightXPos(rightXPos);
        }
    }

    public void resizeWidth(LeftEye leftEye, RightEye rightEye)
    {
        if(leftEye.getLeftXPos() < 25)
        {
            leftEye.setWidthleft(70);
        } else {
            leftEye.setWidthleft(80);
        }

        if(rightEye.getRightXPos() > 200)
        {
            rightEye.setWidthright(70);
        } else {
            rightEye.setWidthright(80);
        }
    }

    public void resizeHeight(LeftEye leftEye, RightEye rightEye)
    {
        if((leftEye.getLeftYPos() > 90 || leftEye.getLeftYPos() < 30) && (rightEye.getRightYPos() > 90 || rightEye.getRightYPos() < 30))
        {
            rightEye.setHeightright(70);
            leftEye.setHeightleft(70);

        } else {
            leftEye.setHeightleft(90);
            rightEye.setHeightright(90);
        }
    }

    public void blink(Eyes eyes, Frame frame)
    {
        int counter = frame.getCounter();

        if (!eyes.isBlink() && ((counter % 1100) == 0))
        {
            eyes.setColor(0,0,0);
            eyes.setBlink(true);
            frame.repaintDrawPanel();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if (counter > 100)
        {
            eyes.setBlink(false);
        }

        counter++;
        frame.setCounter(counter);
    }

    public void angry(Frame frame, Eyes eyes)
    {
        if(frame.isClick())
        {
            eyes.setColor(255,30,30);
            frame.repaintDrawPanel();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            eyes.setColor(10, 200, 255);
        }
    }

    public void boundaries(LeftEye leftEye, RightEye rightEye)
    {
        //left boundary
        if(leftEye.getLeftXPos() < 10)
        {
            leftEye.setLeftXPos(10);
        }

        if(rightEye.getRightXPos() < 110)
        {
            rightEye.setRightXPos(110);
        }

        //right boundary
        if(leftEye.getLeftXPos() > 110)
        {
            leftEye.setLeftXPos(110);
        }

        if(rightEye.getRightXPos() > 210)
        {
            rightEye.setRightXPos(210);
        }

        //upper boundary
        if(leftEye.getLeftYPos() > 110)
        {
            leftEye.setLeftYPos(110);
        }

        if(rightEye.getRightYPos() > 110)
        {
            rightEye.setRightYPos(110);
        }

        //lower boundary
        if(leftEye.getLeftYPos() < 10)
        {
            leftEye.setLeftYPos(10);
        }

        if(rightEye.getRightYPos() < 10)
        {
            rightEye.setRightYPos(10);
        }
    }
}
