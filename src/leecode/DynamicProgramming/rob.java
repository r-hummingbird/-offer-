package leecode.DynamicProgramming;

public class rob {
    public static int rob(int[] nums) {
        int n=nums.length;
        if (n==0)
            return 0;
        if(n==1)
            return nums[0];
        int[] max=new int[n];
        max[0]=nums[0];
        max[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i <n ; i++) {
            max[i]=Math.max(max[i-1],nums[i]+max[i-2]);
        }
        return max[n-1];
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,5,2,7,11};
        System.out.println(rob(nums));
    }
}
