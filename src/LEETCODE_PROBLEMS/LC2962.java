package LEETCODE_PROBLEMS;

public class LC2962 {
    public static void main(String[] args) {
        int nums[] = {1,3,2,3,3};
        int k = 2;
        System.out.println(countSubarrays(nums,k));
    }
    public static long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(nums[i], max);
        }
        int count = 0;
        int l = 1;
        int r = 0;
        int res = 0;
        while(r<nums.length && l<nums.length)
        {
            if(nums[r]==max)count++;
            if(count>=k){
                res++;
            }
            r++;
            if(r==nums.length-1)
            {
                l++;
            }
            if(nums[l-1]==max)count--;

        }
        return count;
    }
}
