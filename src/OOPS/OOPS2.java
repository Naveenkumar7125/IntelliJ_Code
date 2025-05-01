//package OOPS;
//
//import java.util.*;
//class OOPS2
//{
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        double bal = sc.nextDouble();
//        double dep = sc.nextDouble();
//        double with = sc.nextDouble();
////        if((bal + dep) <with)System.out.println("Insufficient Balance");
////        else bal = bal + dep - with;
////        System.out.println("Account Holder: "+name+", Balance: "+bal);
//         BankAccount bk = new BankAccount(name, bal);
//         bk.deposit(dep);
//         bk.withdraw(with);
//         bk.display();
//    }
//}
//
// class BankAccount
// {
//   String accountHolder;
//   double balance;
//
//   public BankAccount(String accountHolder, double balance)
//   {
//     this.accountHolder = accountHolder;
//     this.balance = balance;
//   }
//
//   public void deposit(double amt)
//   {
//     balance = balance + amt;
//   }
//
//   public void withdraw(double amt)
//   {
//     if(balance>=amt)
//       balance = balance - amt;
//     else
//     {
//       System.out.println("Insufficient Balance");
//     }
//   }
//   public void display()
//   {
//     System.out.println("Account Holder: "+accountHolder+", Balance: "+balance);
//   }
// }
