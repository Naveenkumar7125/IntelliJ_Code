package Two_Dim_Array;
import java.util.*;

public class set_matrix_zero {
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
        System.out.println("Enter the Rows and Cols : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Original Array : ");
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==a||j==b)
                {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("Result");
        System.out.println(Arrays.deepToString(arr));
    }

}
