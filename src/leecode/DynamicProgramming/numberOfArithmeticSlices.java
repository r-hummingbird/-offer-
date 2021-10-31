package leecode.DynamicProgramming;

public class numberOfArithmeticSlices {
    public static int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length,ans=0;
        for (int i = 0; i <=n-3 ; i++) {
            for (int j = i+2; j <n ; j++) {
                if (nums[j]-nums[j-1]==nums[j-1]-nums[j-2]){
                    ans++;
                }else {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        System.out.println(numberOfArithmeticSlices(nums));
    }
}
