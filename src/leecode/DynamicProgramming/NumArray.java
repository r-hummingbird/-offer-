package leecode.DynamicProgramming;

public class NumArray {
    static int[] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int left, int right) {
        int sum=0;
        for (int i = left; i <=right ; i++) {
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(0,2);
        System.out.println(param_1);

    }
}
