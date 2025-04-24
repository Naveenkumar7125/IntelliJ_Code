import java.util.*;

public class maximum_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maximum_Swap m = new maximum_Swap();
        int num = 9973;
        System.out.println(m.maximumSwap(num));
    }
    public int maximumSwap(int num) {
        int max = 0;
        int ind = 0;
        int digitCount = (int)Math.log10(num) + 1;
        int temp = num;
        int pow = 1;
        int last_digit = 0;
        int c = 1;
        while(num>0)
        {
            if(max<num%10)
            {
                max = num%10;
                ind = c;
            }
            c++;
            // ind = c;
            pow *= 10;
            last_digit = num%10;
            num /= 10;
        }

        System.out.println("Last_Digit = "+last_digit);
        System.out.println("Largest Number = "+max);
        System.out.println("Index of Largest Number = "+ind);
        if(ind==digitCount)return temp;
        // int res = 0;
        String number = String.valueOf(temp);

        int add = max - last_digit;
        int res = last_digit + max - last_digit;
        for(int i=1;i<number.length();i++)
        {
            int t = number.charAt(i) - '0';
            if(t==max)
            {
                t = t - add;
            }
            res = res * 10 + t;
        }
        return res;
    }
}
