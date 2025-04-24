import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digitCount = (int)Math.log10(num) + 1;
        System.out.println(digitCount);
        int sum = 0;
        while(num>0)
        {
            sum += Math.pow(num%10, digitCount);
            num /= 10;
        }

        System.out.println(sum);
    }
}
