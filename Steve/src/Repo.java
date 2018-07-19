
public class Repo
{

    public void blink(Frame frame)
    {
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
    }
}
