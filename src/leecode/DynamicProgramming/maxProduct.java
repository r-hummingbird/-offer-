package leecode.DynamicProgramming;

public class maxProduct {
    public static int maxProduct(int[] nums) {
        int len=nums.length;
        int[] maxF=new int[len];
        int[] minF=new int[len];
        System.arraycopy(nums,0,maxF,0,len);
        System.arraycopy(nums,0,minF,0,len);
        for (int i = 1; i <len ; i++) {
            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
            minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
        }
        int res=maxF[0];
        for (int i = 1; i <len ; i++) {
            res=Math.max(res,maxF[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
