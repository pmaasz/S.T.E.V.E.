
public class Repo
{
    public int blink(Eyes eyes, int counter)
    {
        counter++;
        if (eyes.isBlink() && counter > 100) {
            eyes.setBlink(false);
            counter = 0;
        } else if (counter > 1100) {
            eyes.setBlink(true);
            counter = 0;
        }

        return counter;
    }
}
