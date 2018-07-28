
public class Steve {

    public static void main (String[] args)
    {
        Frame frame = new Frame();
        Eyes eyes = new Eyes();
        LeftEye leftEye = new LeftEye();
        RightEye rightEye = new RightEye();
        Repo repo = new Repo();

        //Graphic
        while(true)
        {
            int iterator;
            int counter = 0;

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

            System.out.println("success");

            //Up and Down
            if((leftEye.getLeftYPos() > 90 || leftEye.getLeftYPos() < 30) && (rightEye.getRightYPos() > 90 || rightEye.getRightYPos() < 30))
            {
                rightEye.setHeightright(70);
                leftEye.setHeightleft(70);
            } else {
                leftEye.setHeightleft(90);
                rightEye.setHeightright(90);
            }

            //Movement
            if(frame.leftypos < frame.mouseY)
            {
                frame.leftypos++;
                frame.repaintDrawPanel();
            }

            if(frame.leftypos > frame.mouseY)
            {
                frame.leftypos--;
                frame.repaintDrawPanel();
            }

            //Left and Right
            if(frame.leftxpos > 100)
            {
                frame.widthright = 70;
            } else {
                frame.widthright = 80;
            }

            if(frame.leftxpos < 25)
            {
                frame.widthleft = 70;
            } else {
                frame.widthleft = 80;
            }

            //Movement
            if(frame.leftxpos < frame.mouseX)
            {
                frame.leftxpos++;
                frame.repaintDrawPanel();
            }

            if(frame.leftxpos > frame.mouseX)
            {
                frame.leftxpos--;
                frame.repaintDrawPanel();
            }

            //blinking
            repo.blink(frame, counter);

            //look angry
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
