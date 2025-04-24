package Collections;

import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr[] = {10,12,22,55,66,77,88,10};
        int arr2[] = {9,22,31,51,61};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!set.contains(arr2[i])) System.out.print(arr2[i]+" ");
        }
    }
}
