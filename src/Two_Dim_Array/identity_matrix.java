package Two_Dim_Array;

public class identity_matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,0,0},{0,1,0},{0,9,1}};
        if(isIdentity(arr)) System.out.println("Yes");
        else System.out.println("NO");
    }
    public static boolean isIdentity(int arr[][])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==j && arr[i][j]!=1) || (i!=j && arr[i][j]!=0))return false;
            }
        }
        return true;
    }
}
