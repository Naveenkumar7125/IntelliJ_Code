package Two_Dim_Array;

public class toeplitz {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,1,2,3},{7,5,1,2},{8,7,5,1}};
        int arr1[][] = { {1,2,3,4},
                        {5,1,2,3},
                        {6,7,1,2},
                        {7,6,7,1} };
        if(isTeoplitz(arr1)) System.out.println("Yes, it is a toeplitx Matrix");
        else System.out.println("It is not a toeplitx Matrix");

    }
    public static boolean isTeoplitz(int arr[][])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[i][j]!=arr[i+1][j+1])return false;
            }
        }
        return true;
    }
}
