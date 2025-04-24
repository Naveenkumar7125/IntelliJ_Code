import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password : ");
        String s = sc.nextLine();
        if(isStrongPassword(s)) System.out.println(s+" is a Strong Password");
        else System.out.println(s+" is not a Strong Password");
    }
    public static boolean isStrongPassword(String s)
    {
        boolean digit = false;
        boolean up  = false;
        boolean lw = false;

        if(s.length()<8 )return false;
        if(s.contains(Character.toString(' ')))return false;
        for(int i=0;i<s.length();i++)
        {

            char ch = s.charAt(i);
//            if(ch==' ')return false;
            if(digit && up && lw)return true;
            if(ch>=48 && ch<=57)digit = true;
            else if(ch>='a' && ch<='z')lw = true;
            else if(ch>='A' && ch<='Z')up = true;
        }
        return digit && up && lw;
    }
}
