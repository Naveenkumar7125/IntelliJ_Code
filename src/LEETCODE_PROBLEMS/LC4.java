package LEETCODE_PROBLEMS;
import java.util.*;
public class LC4 {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int s1 = nums1.length;
        int s2 = nums2.length;
        int sum = s1+s2;
        int arr[] = new int[sum];
        int k = 0;
        for(int i=0;i<s1;i++)
        {
            arr[k++] = nums1[i];
        }
        for(int i = 0;i<s2;i++)
        {
            arr[k++] = nums2[i];
        }

        int n = (nums1.length + nums2.length) /  2;
        boolean flag = true;
        if(n%2==0)flag = false;
        int res[] = new int[nums1.length+nums2.length];
        int c = 0;
        // while(l<nums1.length || r<nums2.length)
        // {
        int l = 0;
        int r = 0;
        while(l<nums1.length && r<nums2.length)
        {
            if(nums1[l]<nums2[r])
            {
                res[c++] = nums1[l];
                l++;
            }
            else
            {
                res[c++] = nums2[r];
                r++;
            }
            if(c==n && flag)return (double)c;

        }

        System.out.println(Arrays.toString(res));
        // for(int i=0;i<)
        // Arrays.sort(arr);
        // for(int i=0;i<sum;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        if(sum%2!=0)
        {
            return (double)arr[sum/2];
        }
        else
        {
            int middle1 = arr[sum / 2 - 1];
            int middle2 = arr[sum / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }


    }
}
