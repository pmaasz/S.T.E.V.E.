
public class Repo
{
    public void blink(Frame frame, int counter)
    {
        counter++;

        if (frame.isBlink() && counter > 100)
        {
            frame.setBlink(false);
        } else if (counter > 1100)
        {
            frame.setBlink(true);
        }
    }
}
