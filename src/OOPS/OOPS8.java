package OOPS;

import java.util.Scanner;

public class OOPS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Balance : ₹");
        double bal = sc.nextDouble();
        System.out.print("Enter the Amount to deposit : ₹");
        double d = sc.nextDouble();
        System.out.print("Enter the Amount to withdraw : ₹");
        double w = sc.nextDouble();

        SavingsAccount bk = new SavingsAccount(bal, w, d);
        System.out.println("\n\nYour Current Balance is : ₹"+bk.bal);
        bk.deposit();
        System.out.println("The amount after the deposit is : ₹"+bk.bal);
        bk.withdraw();
        System.out.println("The amount after the Withdrawl is : ₹"+bk.bal);


    }
}

interface BankAccount
{
    void deposit();
    void withdraw();
//    void getbal();
}

class SavingsAccount implements BankAccount
{
    public double bal;
    double w;
    double d;

    public SavingsAccount(double bal, double w, double d)
    {
        this.bal = bal;
        this.w = w;
        this.d = d;
    }

    public void deposit()
    {
        bal += d;
    }

    public void withdraw()
    {
        bal -= w;
    }
}


class CurrentAccount implements BankAccount
{
    double bal;
    double w;
    double d;

    public CurrentAccount(double bal, double w, double d)
    {
        this.bal = bal;
        this.w = w;
        this.d = d;
    }

    public void deposit()
    {
        bal += d;
    }

    public void withdraw()
    {
        bal -= w;
    }
}

