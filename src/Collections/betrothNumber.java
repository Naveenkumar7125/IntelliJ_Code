package Collections;

import java.util.Scanner;

public class betrothNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res1 = sumOfFactors(n1);
        int res2 = sumOfFactors(n2);
        System.out.println(res1);
        System.out.println(res2);
        if((n2+1)==res1 && (n1+1)==res2) System.out.println("YES");
        else System.out.println("NO");
    }
    public static int sumOfFactors(int n)
    {
        int sum = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)sum += i;
        }
        return sum;
    }
}
