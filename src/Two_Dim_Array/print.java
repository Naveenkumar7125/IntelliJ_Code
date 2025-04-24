package Two_Dim_Array;

import java.util.*;

public class print {
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
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(args));
        System.out.println("Hi");
//        main(new String[]{"Naveen"});
    }
}
