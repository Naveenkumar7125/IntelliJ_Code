package OOPS.METHPD_OVERLOADING;

public class Main {
    public static void main(String[] args) {
        
    }
}

class Vehicle
{
    void rent()
    {
        System.out.println();
    }
}

class Car extends Vehicle
{
    void rent()
    {
        System.out.println(" ");
    }
}

class Bike extends Vehicle
{
    void rent()
    {
        System.out.println("");
    }
}