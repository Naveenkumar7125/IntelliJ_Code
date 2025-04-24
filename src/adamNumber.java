import java.util.Scanner;

public class adamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int normalSq = a * a;
        int rev = reverse(a);
        int revSq = rev * rev;
        int reverseSqueare = reverse(revSq);
        if(normalSq==reverseSqueare)System.out.println("Yes, it is an Adam Number");
        else System.out.println("No, it's not a Adam Number");

    }
    public static int reverse(int n)
    {
        int rev = 0;
        while(n>0)
        {
            rev = rev * 10 + n%10;
            n /= 10;
        }
        return rev;
    }
}
