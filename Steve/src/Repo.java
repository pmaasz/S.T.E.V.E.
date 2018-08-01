public class Repo
{
    public void blink(Eyes eyes, Frame frame)
    {
        int counter = frame.getCounter();

        if (!eyes.isBlink() && ((counter % 1100) == 0))
        {
            eyes.setBlink(true);
            eyes.setColor(0,0,0);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if (counter > 1100)
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
        } else {
            eyes.setColor(10, 200, 255);
        }
    }
}
