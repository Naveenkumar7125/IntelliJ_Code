package OOPS;

import java.util.*;
class OOPS3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
//        System.out.println("Name: "+name+", Roll No: "+rollno+", Grade: "+grade(m1,m2,m3));
//        System.out.println("Name: "+name+", Roll No: "+rollno+", Grade: "+grade());
        Student st = new Student(name, rollno, m1,m2, m3);
        st.display();
    }


}

 class Student
 {
   String name;
   static int rollno;
   static int m1;
   static int m2;
   static int m3;

   public Student(String name, int rollno, int m1,int m2,int m3)
   {
     this.name = name;
     this.rollno = rollno;
     this.m1 = m1;
     this.m2 = m2;
     this.m3 = m3;
   }

   public static char grade()
   {
     int total = (m1 + m2 + m3 ) /3;
     if(total>=90)return 'A';
     else if(total>=75)return 'B';
     else if(total>=50)return 'C';
     else return 'D';
   }

   public void display()
   {
     System.out.println("Name: "+name+", Roll No: "+rollno+" Grade: "+grade());
   }
 }