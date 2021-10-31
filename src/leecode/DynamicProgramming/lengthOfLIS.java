package leecode.DynamicProgramming;

public class lengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        int max=0;
        int[] dp=new int[nums.length];
        for (int num:nums){
            int l=0,r=max;
            while (l<r){
                int mid=l+(r-l)/2;
                if (dp[mid]<num){
                    l=mid+1;
                }else {
                    r=mid;
                }
            }
            dp[l]=num;
            if (l==max)
                max++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
}
