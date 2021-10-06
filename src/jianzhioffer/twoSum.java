package jianzhioffer;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left < right){

            if(nums[left] + nums[right] < target)left++;
            else if(nums[left] + nums[right] > target)right--;
            else return new int[] {left, right};

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums={1,2,4,6,10};
        int target=8;
        int[] result=twoSum(nums,target);
        for (int rel:result){
            System.out.print(rel+" ");
        }
    }
}
