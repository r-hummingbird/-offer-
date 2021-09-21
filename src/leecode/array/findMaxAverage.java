package leecode.array;


public class findMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        double ans = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        ans = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            ans = Math.max(ans, sum / k);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
