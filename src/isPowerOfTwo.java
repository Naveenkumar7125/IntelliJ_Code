import java.util.Scanner;

public class isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        if(a==1) System.out.println("Yes, it is Power of Two");
        if((a & a-1)==0 || a==1) System.out.println("Yes, it is Power of Two");
        else System.out.println("No, it is not a Power of Two");
    }
}
