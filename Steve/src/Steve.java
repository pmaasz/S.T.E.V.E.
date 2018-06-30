import java.awt.Color;
import java.awt.event.*;

public class Steve {

    public static void main (String[] args) {

        Frame f = new Frame();
        f.setSize(300,300);
        f.setVisible(true);
        f.setResizable(false);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //Audio a = new Audio();

        LeftEye leftEye = new LeftEye();
        RightEye rightEye = new RightEye();
        Eyes eyes = new Eyes();

        //Graphic
        while(true) {
            int i;							//upper left corner for reference

            //Up and Down
            if(f.leftypos > 90 || f.leftypos < 30) {			//Resizing the eyes
                f.heightright = 70;
                f.heightleft = 70;
            } else {
                f.heightleft = 90;
                f.heightright = 90;
            }
            if(f.leftypos < 10) f.leftypos = 10;				//Bounds
            if(f.leftypos > 110) f.leftypos = 110;
            for(i = 0; i < f.mouseY;) {							//Movement
                if(f.leftypos < f.mouseY) {
                    f.leftypos++;

                    f.repaintDrawPanel();
                }break;
            }
            for(i = 0; i < f.mouseY;) {
                if(f.leftypos > f.mouseY){
                    f.leftypos--;

                    f.repaintDrawPanel();
                }break;
            }

            //Left and Right
            if(f.leftxpos > 100) {								//Resizing the eyes
                f.widthright = 70;
            } else {
                f.widthright = 80;
            }
            if(f.leftxpos < 25) {
                f.widthleft = 70;
            } else {
                f.widthleft = 80;
            }
            if(f.leftxpos<10) f.leftxpos = 10;					//Bounds
            if(f.leftxpos>110) f.leftxpos = 110;
            for(i = 0; i < f.mouseX;){							//Movement
                if(f.leftxpos < f.mouseX) {
                    f.leftxpos++;

                    f.repaintDrawPanel();
                }break;
            }
            for(i = 0; i < f.mouseX;){
                if(f.leftxpos > f.mouseX) {
                    f.leftxpos--;

                    f.repaintDrawPanel();
                }break;
            }

            //blinking
            f.counter++;
            if (f.blink && f.counter > 100) {
                f.blink = false;
                f.counter = 0;
            } else if (f.counter > 1100) {
                f.blink = true;
                f.counter = 0;
            }

            //Visualizer
            for(i = 0; i < 305;) {        		 		 //Movement
                if(f.dotx < 300) {
                    f.dotx++;
                }
                if(f.dotx > 299){
                    f.dotx = 1;
                }
                break;
            }

            if(f.click == true) {
                f.c = new Color(255,30,30);
            } else {
                f.c = new Color(10, 200, 255);
            }

            //Frame
            f.repaintDrawPanel();

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void moveLeftY(LeftEye leftEye)
    {

    }

    public void moveLeftX(LeftEye leftEye)
    {

    }

    public void moveRightY( )
    {

    }

    public void moveRightX()
    {

    }
}
