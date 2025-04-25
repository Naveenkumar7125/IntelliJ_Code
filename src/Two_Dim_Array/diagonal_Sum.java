package Two_Dim_Array;

public class diagonal_Sum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfDiagonals(arr));
    }
    public static int sumOfDiagonals(int arr[][])
    {
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            sum += arr[i][i];
            sum += arr[i][n-i-1];
        }
        if(n%2!=0)sum -= arr[n/2][n/2];
        return sum;
    }
}
