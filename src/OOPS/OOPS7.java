package OOPS;

import java.util.Scanner;

public class OOPS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entr VEG / NON-VEG : ");
        String s = sc.next().toLowerCase();
        System.out.println("Enter the Item name : ");
        String name = sc.next();
        System.out.print("Enter the Amount : ₹");



        int amt = sc.nextInt();
//        System.out.print(".00");
        System.out.println("\n\n-------------------BILL-----------------");
        if(s.equals("veg"))
        {
            Veg v = new Veg(name, amt);
            v.eat();
        }
        else if(s.equals("nonveg")) {
            NONVeg nv = new NONVeg(name, amt);
            nv.eat();

        }
        else
        {
            System.out.println("R u gone maaad.....");
        }
        System.out.println("\n--------------**********-------------");

    }
}

interface Food
{
    void eat();
}

class Veg implements Food
{
    String item;
    int amt;
    public Veg(String item, int amt)
    {
        this.item = item;
        this.amt = amt;
    }
    public void eat()
    {
        System.out.println("Veg Food Item you eat is "+item);
        System.out.println("The total Amount is "+amt);
    }
}

class NONVeg implements Food
{
    String item;
    int amt;
    public NONVeg(String item, int amt)
    {
        this.item = item;
        this.amt = amt;
    }
    public void eat()
    {
        System.out.println("NON - Veg Food Item you eat is "+item);
        System.out.println("The total Amount is "+amt);
    }
}
