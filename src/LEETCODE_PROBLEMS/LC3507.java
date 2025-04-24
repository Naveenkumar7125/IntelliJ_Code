package LEETCODE_PROBLEMS;

import java.util.Scanner;

public class LC3507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,2,3,1};
        System.out.println(minimumPairRemoval(arr));
    }
    public static int minimumPairRemoval(int[] nums) {
        int c = 0;
        if(isSorted(nums,nums.length))return 0;
        for(int i=nums.length-1;i>=1;i--)
        {
            if(nums[i]<nums[i-1])
            {
                nums[i-1] += nums[i];
            }
            if(isSorted(nums, i))return nums.length - i;
        }
        return 0;
    }
    public static boolean isSorted(int[] arr,int end)
    {
        for(int i=1;i<end;i++)
        {
            if(arr[i]<arr[i-1])return false;
        }
        return true;
    }
}
