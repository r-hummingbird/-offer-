package leecode.array;

import java.util.Arrays;

public class findShortestSubArray {
    public static int findShortestSubArray(int[] nums) {
        int degree=0,n=nums.length;
        int[] cnt = new int[50000];
        for(int i = 0; i < n; i ++){
            cnt[nums[i]] ++;
            degree = Math.max(degree, cnt[nums[i]]);
        }
        Arrays.fill(cnt, 0);
        int l = 0, r = 0;
        int result = Integer.MAX_VALUE;
        while(l <= r && r < n){
            cnt[nums[r]] ++;
            while(cnt[nums[r]] == degree){
                result = Math.min(result, r - l + 1);
                cnt[nums[l]] --;
                l ++;
            }
            r ++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
