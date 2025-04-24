import java.util.Scanner;

public class digitToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder res = new StringBuilder();
        while(n>0)
        {
            res.append(n%2);
            n /= 2;
        }
        System.out.println(res.reverse());
    }
}
