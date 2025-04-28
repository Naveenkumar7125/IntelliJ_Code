package OOPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = sc.nextInt();
        Student st = new Student();
        st.display(name, n);
    }
}
class Student{
    String name;
    int age;

    public void display(String name, int age)
    {
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
    }
}
