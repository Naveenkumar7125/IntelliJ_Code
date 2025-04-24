import java.util.*;
public class magicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int safe = num;
        int sum = 0;
        while(num>0)
        {
            sum += num%10;
            num /= 10;
        }
        int safe2 = sum;
        int reverseSum = 0;
        while(sum>0)
        {
            reverseSum = reverseSum * sum%10;
            sum /= 10;
        }
        int prod = reverseSum * safe2;
        if(prod==num)
        {
            System.out.println("Magic Number");
        }
        else
            System.out.println("Not a Magic Number");

    }
}
