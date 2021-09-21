package leecode.array;

import java.util.Arrays;

public class maximumProduct {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return Math.max(nums[0]*nums[1]*nums[n - 1], nums[n - 1]*nums[n - 2]*nums[n - 3]);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

}
