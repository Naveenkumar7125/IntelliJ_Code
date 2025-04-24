import java.util.Scanner;

public class binaryToDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        StringBuilder s = new StringBuilder(str).reverse();
        System.out.println(s);
        for(int i=0;i<s.toString().length();i++)
        {
            if(s.charAt(i)=='1')
                num += 1<<i;
        }
        System.out.println(1<<1);
        System.out.println(num);
    }
}
