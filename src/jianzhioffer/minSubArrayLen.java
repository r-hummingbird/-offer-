package jianzhioffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class minSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0,right = 0;
        int sum = 0,min = nums.length+1;
        while(right<nums.length) {
            sum+=nums[right++];
            while(left<=right&&sum>=target) {
                min = Math.min(min,right-left);
                sum-=nums[left++];
            }
        }
        return min == nums.length+1?0:min;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,4,4};
        int target=4;
        System.out.println(minSubArrayLen(target,nums));
    }
}
