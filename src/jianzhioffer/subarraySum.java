package jianzhioffer;

public class subarraySum {
    public static int subarraySum(int[] nums, int k) {
        int[] sum=new int[nums.length+1];
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            sum[i+1]=nums[i]+sum[i];
        }
        for (int i = 0; i <sum.length ; i++) {
            for (int j = i+1; j <sum.length ; j++) {
                if (sum[j]-sum[i]==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1};
        int k=2;
        System.out.println(subarraySum(nums,k));
    }
}
