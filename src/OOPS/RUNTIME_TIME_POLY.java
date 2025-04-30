package OOPS;

public class RUNTIME_TIME_POLY {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.Sound();
        Vehicle b = new Bike();
        b.Sound();
        Vehicle v = new Vehicle();
        v.Sound();

    }
}

class Vehicle
{
    void Sound()
    {
        System.out.println("rrrrrrrrrrrrrrrrddrdrdrdrrdrdrdr");
    }
}

class Car extends Vehicle
{
    void Sound()
    {
        System.out.println("uyuggggggggggggggggggggggggggggggggggggggg.........!!!!");
    }
}



class Bike extends Vehicle
{
    void Sound()
    {
        System.out.println("rrrr.....rrrr...dr..dr..dr..dr..dr..dr..drdrdrdrdrdrdrdr");
    }
}