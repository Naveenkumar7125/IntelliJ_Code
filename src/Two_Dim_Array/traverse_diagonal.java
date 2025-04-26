package Two_Dim_Array;

import java.util.Scanner;

public class traverse_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int m = 0;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0;
        for(int j=0;j<n;j++)
        {
            i = 0;
            int k = j;
            while(k>=0 && i<n)
            {
                System.out.print(arr[i++][k--]+" ");
            }
            System.out.println();
        }
        for(i=1;i<n;i++)
        {
            int j = n-1;
            int k = i;
            while(i<n)
            {
                System.out.print(arr[i++][j--]+" ");
            }
            System.out.println();
        }



    }
}
