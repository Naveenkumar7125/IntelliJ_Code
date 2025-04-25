package Two_Dim_Array;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[][] = new int[n][n];
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        int n = 4;
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            reverse(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void reverse(int arr[])
    {
        int l = 0;
        int r = arr.length-1;
        while(l<=r)
        {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
