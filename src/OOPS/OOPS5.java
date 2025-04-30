package OOPS;

import java.util.Scanner;

public class OOPS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Transport : (bus) / (train)");
        String s = sc.next();
        if(s.equalsIgnoreCase("train"))
        {
            System.out.println("Enter the name : ");
            String name = sc.next();
            System.out.println("Enter the coach Number : ");
            int cn = sc.nextInt();
            System.out.println("Enter the Seat Number : ");
            int sn = sc.nextInt();
            System.out.println("Enter the Berth : ");
            String berth = sc.next();
            TicketBooking t = new TicketBooking();
            t.ticketBook(name, cn, sn, berth);
        }
        else if(s.equalsIgnoreCase("bus"))
        {
            System.out.println("Enter the name : ");
            String name = sc.next();
            System.out.println("Enter the coach Number : ");
            int cn = sc.nextInt();
            System.out.println("Enter the Seat Number : ");
            int sn = sc.nextInt();
            TicketBooking t = new TicketBooking();
            t.ticketBook(name, cn, sn);
        }
    }
}

class TicketBooking
{
    public void ticketBook(String name, int seat_no, int bus_no)
    {
        System.out.println("Passenger Name : "+name);
        System.out.println("Seat Number : "+seat_no);
        System.out.println("Bus Number : "+bus_no);
    }

    public void ticketBook(String name, int coach_no,int seat_no, String berth)
    {
        System.out.println("Passenger Name : "+name);
        System.out.println("Coach Number : "+coach_no);
        System.out.println("Seat Number : "+seat_no);
        System.out.println("Berth : "+berth);
    }
}