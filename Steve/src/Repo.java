
public class Repo
{
    public void blink(Frame frame, int counter)
    {
        counter++;

        if (frame.blink && counter > 100)
        {
            frame.blink = false;
        } else if (counter > 1100)
        {
            frame.blink = true;
        }
    }
}
