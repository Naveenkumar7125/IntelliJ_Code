import java.util.Scanner;

public class Automorphic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int digitCount = (int)Math.log10(n) + 1;
        int pow = (int)Math.pow(10, digitCount);
        if((sq%pow)==n) System.out.println("Yes");
        else System.out.println("No");

    }
}
