package jianzhioffer;

public class pivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= nums.length; i ++){
            sum[i] = nums[i - 1] + sum[i - 1];
        }
        for (int j = 1; j <= n; j ++){
            if (sum[n] - sum[j] == sum[j - 1]) return j - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
