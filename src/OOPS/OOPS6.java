package OOPS;

public class OOPS6 {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
        Piano p = new Piano();
        p.play();
    }
}

interface Playable
{
    void play();
}

class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Guitar is playing....");
    }
}

class Piano implements Playable
{
    public void play()
    {
        System.out.println("Piano is playing....");
    }
}
