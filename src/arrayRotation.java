import java.util.*;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotation : ");
        int r = sc.nextInt();
        r = r%n;
        if(r<0)r = n+r;
        reverse(arr, 0, n-1);
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        System.out.println(Arrays.toString(arr));
//        Rotate the First half of the array

    }
    public static void reverse(int arr[],int l, int r)
    {
        while(l<=r)
        {
            arr[l] = arr[l] + arr[r] - (arr[r--] = arr[l++]);
//            l++;
//            r--;
        }
    }
}
