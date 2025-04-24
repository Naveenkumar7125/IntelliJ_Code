package Two_Dim_Array;

import java.util.Arrays;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int arr2[][] = new int[n1][m1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        int res[][] = new int[n][m];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                for(int k=0;k<m1;k++)
                {
                    res[i][j] += arr[i][k] * arr[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
