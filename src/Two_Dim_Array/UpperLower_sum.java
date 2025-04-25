package Two_Dim_Array;

public class UpperLower_sum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int res[] = sum(arr);
        System.out.println("Upper triangle : "+res[0]);
        System.out.println("Lower triangle : "+res[1]);
    }
    public static int[] sum(int arr[][])
    {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=j)sum1 += arr[i][j];
                if(j<=i)sum2 += arr[i][j];
            }
        }
        return new int[]{sum1, sum2};
    }

}
