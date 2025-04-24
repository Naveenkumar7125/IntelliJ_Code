import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(pow(n,base));

    }
    public static int pow(int n,int base)
    {
        if(base<=1)return 1;
        return n * (pow(n,base-1));
    }
}
