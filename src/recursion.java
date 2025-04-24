import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t(5);

    }
    public static void t(int n)
    {
        if(n==1) System.out.print(1);
        else
        {
            t(n-1);
            System.out.print(n+" -->");
            t(n-1);
        }
    }
}
