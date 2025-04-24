import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        int g = gcd(arr[0], arr[1]);
        for(int i=3;i<arr.length;i++)
        {
            int min = Math.min(g, arr[i]);
            g = gcd((g + arr[i] - min), min);
        }
        System.out.println("The GCD of the above given array is "+g);
    }
    public static int gcd(int a, int b)
    {
        if(b==0)return a;
        return gcd(b, a%b);
    }
}
