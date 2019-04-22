public class Repo
{
    public void movingUp(Eye leftEye, Eye rightEye, Frame frame)
    {
        if(leftEye.getYPos() < frame.getMouseY() || rightEye.getYPos() < frame.getMouseY())
        {
            int leftYPos = leftEye.getYPos();
            int rightYPos = rightEye.getYPos();

            leftYPos++;
            rightYPos++;

            leftEye.setYPos(leftYPos);
            rightEye.setYPos(rightYPos);
        }
    }

    public void movingDown(Eye leftEye, Eye rightEye, Frame frame)
    {
        if(leftEye.getYPos() > frame.getMouseY() || rightEye.getYPos() > frame.getMouseY())
        {
            int leftYPos = leftEye.getYPos();
            int rightYPos = rightEye.getYPos();

            leftYPos--;
            rightYPos--;

            leftEye.setYPos(leftYPos);
            rightEye.setYPos(rightYPos);
        }
    }

    public void movingRight(Eye leftEye, Eye rightEye, Frame frame)
    {
        if(leftEye.getXPos() < frame.getMouseX() || rightEye.getXPos() < frame.getMouseX())
        {
            int leftXPos = leftEye.getXPos();
            int rightXPos = rightEye.getXPos();

            leftXPos++;
            rightXPos++;

            leftEye.setXPos(leftXPos);
            rightEye.setXPos(rightXPos);
        }
    }

    public void movingLeft(Eye leftEye, Eye rightEye, Frame frame)
    {
        if(leftEye.getXPos() > frame.getMouseX() || rightEye.getXPos() > frame.getMouseX())
        {
            int leftXPos = leftEye.getXPos();
            int rightXPos = rightEye.getXPos();

            leftXPos--;
            rightXPos--;

            leftEye.setXPos(leftXPos);
            rightEye.setXPos(rightXPos);
        }
    }

    public void resizeWidth(Eye leftEye, Eye rightEye)
    {
        if(leftEye.getXPos() < 25)
        {
            leftEye.setWidth(70);
        } else {
            leftEye.setWidth(80);
        }

        if(rightEye.getXPos() > 200)
        {
            rightEye.setWidth(70);
        } else {
            rightEye.setWidth(80);
        }
    }

    public void resizeHeight(Eye leftEye, Eye rightEye)
    {
        if((leftEye.getYPos() > 90 || leftEye.getYPos() < 30) && (rightEye.getYPos() > 90 || rightEye.getYPos() < 30))
        {
            rightEye.setHeight(70);
            leftEye.setHeight(70);
        } else {
            leftEye.setHeight(90);
            rightEye.setHeight(90);
        }
    }

    public void blink(Eye leftEye, Eye rightEye, Frame frame)
    {
        int counter = frame.getCounter();

        if ((!leftEye.isBlink() && !rightEye.isBlink()) && ((counter % 1100) == 0))
        {
            leftEye.setColor(0,0,0);
            rightEye.setColor(0,0,0);

            leftEye.setBlink(true);
            rightEye.setBlink(true);

            frame.repaintDrawPanel();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if (counter > 100)
        {
            leftEye.setBlink(false);
            rightEye.setBlink(false);
        }

        counter++;
        frame.setCounter(counter);
    }

    public void angry(Frame frame, Eye leftEye, Eye rightEye)
    {
        if(frame.isClick())
        {
            leftEye.setColor(255,30,30);
            rightEye.setColor(255,30,30);

            int count = frame.getClickCounter();

            count++;
            frame.setClickCounter(count);
            frame.repaintDrawPanel();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            leftEye.setColor(10, 200, 255);
            rightEye.setColor(10, 200, 255);
        }
    }

    public void boundaries(Eye leftEye, Eye rightEye)
    {
        //left boundary
        if(leftEye.getXPos() < 10)
        {
            leftEye.setXPos(10);
        }

        if(rightEye.getXPos() < 110)
        {
            rightEye.setXPos(110);
        }

        //right boundary
        if(leftEye.getXPos() > 110)
        {
            leftEye.setXPos(110);
        }

        if(rightEye.getXPos() > 210)
        {
            rightEye.setXPos(210);
        }

        //upper boundary
        if(leftEye.getYPos() > 110)
        {
            leftEye.setYPos(110);
        }

        if(rightEye.getYPos() > 110)
        {
            rightEye.setYPos(110);
        }

        //lower boundary
        if(leftEye.getYPos() < 10)
        {
            leftEye.setYPos(10);
        }

        if(rightEye.getYPos() < 10)
        {
            rightEye.setYPos(10);
        }
    }

    public void sleep(Eye leftEye, Eye rightEye)
    {
        rightEye.setXPos(155);
        rightEye.setYPos(40);
        rightEye.setCurve(15);
        rightEye.setHeight(10);

        leftEye.setXPos(55);
        leftEye.setYPos(40);
        leftEye.setCurve(15);
        leftEye.setHeight(10);
    }
}
