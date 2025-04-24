import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9,10};
        int n = arr.length;
        int ind = 0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!= arr[i+1])
            {
                arr[ind++] = arr[i];
//                arr[ind++] = arr[i+1];
            }
        }
        arr[ind] = arr[n-1];
        ind++;
        while(ind<n)
        {
            arr[ind++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
