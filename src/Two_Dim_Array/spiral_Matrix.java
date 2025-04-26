package Two_Dim_Array;

import java.util.Scanner;

public class spiral_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
    }
}
