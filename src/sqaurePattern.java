import java.util.Scanner;

public class sqaurePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
//        for(int i=0;i<m;i++)
//        {
//            int n = 1;
//            for(int k = 0;k<=m-i;k++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=0;j < 2 * i - 1;j++)
//            {
//                System.out.print(n);
//                if(j>1)
//                {
//                    n--;
//                }
//                else n++;
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            for(int k=1;k<n*2 - i * 2;k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n+i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }
}
