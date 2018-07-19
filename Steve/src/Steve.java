 import java.awt.Color;
import java.awt.event.*;

public class Steve {

    public static void main (String[] args)
    {
        Frame frame = new Frame();
        Eyes eyes = new Eyes();
        Dot dot = new Dot();
        LeftEye leftEye = new LeftEye();
        RightEye rightEye = new RightEye();

        //Graphic
        while(true)
        {
            int i;							//upper left corner for reference

            //Up and Down
            if(frame.leftypos > 90 || frame.leftypos < 30)
            {			//Resizing the eyes
                frame.heightright = 70;
                frame.heightleft = 70;
            } else {
                frame.heightleft = 90;
                frame.heightright = 90;
            }

            if(frame.leftypos < 10) frame.leftypos = 10;				//Bounds

            if(frame.leftypos > 110) frame.leftypos = 110;

            for(i = 0; i < frame.mouseY;)
            {							//Movement
                if(frame.leftypos < frame.mouseY)
                {
                    frame.leftypos++;

                    frame.repaintDrawPanel();
                }

                break;
            }

            for(i = 0; i < frame.mouseY;)
            {
                if(frame.leftypos > frame.mouseY)
                {
                    frame.leftypos--;
                    frame.repaintDrawPanel();
                }

                break;
            }

            //Left and Right
            if(frame.leftxpos > 100)
            {								//Resizing the eyes
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

            if(frame.leftxpos<10) frame.leftxpos = 10;					//Bounds

            if(frame.leftxpos>110) frame.leftxpos = 110;

            for(i = 0; i < frame.mouseX;)
            {							//Movement
                if(frame.leftxpos < frame.mouseX)
                {
                    frame.leftxpos++;
                    frame.repaintDrawPanel();
                }

                break;
            }

            for(i = 0; i < frame.mouseX;)
            {
                if(frame.leftxpos > frame.mouseX)
                {
                    frame.leftxpos--;
                    frame.repaintDrawPanel();
                }

                break;
            }

            //blinking
            frame.counter++;

            if (frame.blink && frame.counter > 100)
            {
                frame.blink = false;
                frame.counter = 0;
            } else if (frame.counter > 1100)
            {
                frame.blink = true;
                frame.counter = 0;
            }

            //Visualizer
            for(i = 0; i < 305;)
            {        		 		 //Movement
                if(frame.dotx < 300)
                {
                    frame.dotx++;
                }

                if(frame.dotx > 299)
                {
                    frame.dotx = 1;
                }

                break;
            }

            if(frame.click == true)
            {
                frame.c = new Color(255,30,30);
            } else {
                frame.c = new Color(10, 200, 255);
            }

            //Frame
            frame.repaintDrawPanel();

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
