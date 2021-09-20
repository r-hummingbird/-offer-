package leecode.array;

public class findUnsortedSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length , max = nums[0] , min = nums[n-1] , right = 0 , left = n -1;
        if (n == 1) return 0;
        // 若 nums[i] 左边 有数大于它。 那么 nums[i] 一定要被重排;  right >= i
        for (int i = 1; i < n; i++){
            if (max > nums[i]) right = i;
                // 更新当前最大值。
            else max = nums[i];
        }
        // 若nums[i]右边，有数小于它。那么nums[i]一定要被重排 , left <= i
        for (int i = n - 2; i >=0; i--){
            if (min < nums[i]) left = i;
                // 更新当前最小值
            else min = nums[i];
        }
        return Math.max(right - left + 1 ,0);

    }



    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
