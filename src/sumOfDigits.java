import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfDigit(12342134));

    }
    public static int sumOfDigit(int n)
    {
        if(n==0)return 0;
        return n%10 + sumOfDigit(n/10);
    }
}
