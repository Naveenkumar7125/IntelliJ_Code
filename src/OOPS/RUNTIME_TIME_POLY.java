package OOPS;

public class RUNTIME_TIME_POLY {
    public static void main(String[] args) {
        Car c = new Car();
        c.Sound();
        Bike b = new Bike();
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





//Method OverLoading is the overriding the same method with different parameters on a same function

// Whereas, Method Overriding is the overriding the method on different Classes with different Parameters