
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
            int i; //iterator
            int leftYPos = leftEye.getLeftYPos();
            int leftXPos = leftEye.getLeftXPos();
            int rightYPos = rightEye.getRightYPos();
            int counter = 0;

            //System.out.println("hey");

            //Up and Down
            if((leftYPos > 90 || leftYPos < 30) && (rightYPos > 90 || rightYPos < 30))
            {
                rightEye.setHeightright(70);
                leftEye.setHeightleft(70);
            } else {
                leftEye.setHeightleft(90);
                rightEye.setHeightright(90);
            }

            //Bounds
            if(frame.leftypos < 10) frame.leftypos = 10;

            if(frame.leftypos > 110) frame.leftypos = 110;

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

            //Bounds
            if(frame.leftxpos<10) frame.leftxpos = 10;

            if(frame.leftxpos>110) frame.leftxpos = 110;

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
