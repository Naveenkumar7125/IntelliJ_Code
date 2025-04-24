import java.util.*;

public class Prime_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            int n = str.charAt(i) - '0';
            if(isPrime(n))lst.add(n);
        }
        System.out.println(lst);
    }
    public static boolean isPrime(int n)
    {
        return n%2!=0 || n==2 ;
    }
}
