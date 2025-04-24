package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n1 = sc.nextInt();
        System.out.println("Enter the Array Elements : ");
        int arr[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Array Size:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        int res[] = new int[n1+n2];
        int l = 0;
        int r = 0;

//        for(int i=0;i<res.length;i++){
//            if(arr[l]<arr[r])
//            {
//                res[i] = arr[l];
//            }
//        }
        List<Integer> lst = new ArrayList<>();
//        for(int i=0;i<(n1+n2);i++)
//        {
//            if(arr[l]<arr2[r] && l<arr.length)
//            {
//                lst.add(arr[l]);
//                l++;
//            }
//            else
//            {
//                if(r<arr2.length) {
//                    lst.add(r);
//                    r++;
//                }
//            }
//        }
        while (l<arr.length || r<arr2.length)
        {
            if(l<arr.length && r<arr2.length)
            {
                if(arr[l]<arr2[r])
                {
                    lst.add(arr[l]);
                    l++;
                }
                else {
                    lst.add(arr2[r]);
                    r++;
                }
            }
            else if(l<arr.length)
            {
                lst.add(arr[l]);
                l++;
            }
            else
            {
                lst.add(arr[r]);
                r++;
            }
        }
        System.out.println(lst);
     }
}
