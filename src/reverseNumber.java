import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = reverse(a,0);
        System.out.println(res);

    }
    public static int reverse(int n,int rev)
    {
        return n==0?rev:reverse(n/10, rev*10 + (n%10));
        //        if(n==0)
//        {
////            System.out.println(rev);
//            return rev;
//        }
//        rev = rev * 10 + (n%10);
//        return reverse(n/10,rev);
    }
}
