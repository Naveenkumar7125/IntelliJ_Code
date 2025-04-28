package OOPS;

import java.util.Scanner;

public class OOPS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee emp[] = new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter your name : ");
            String name = sc.next();
            System.out.println("Enter your ID : ");
            String id = sc.next();
            System.out.println("Enter your salary : ");
            int salary = sc.nextInt();
            System.out.println("Enter your join_Date : ");
            String joindate = sc.next();
            Employee e = new Employee(name, id, salary, joindate);
            emp[i] = e;
//            e.display();
//            e.display();
        }
        for(Employee e : emp)
        {
            e.display();
            System.out.println();
            System.out.println();
        }



    }
}

class Employee
{
    public String name;
    public String id;
    public int salary;
    public String join_Date;

    public Employee(String name, String id, int salary,String join_Date)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.join_Date = join_Date;
    }
    public void display()
    {
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);
        System.out.println("Employee Join Date : "+join_Date);
    }
}
