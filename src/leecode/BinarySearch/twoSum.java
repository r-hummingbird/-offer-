package leecode.BinarySearch;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left < right){

            if(nums[left] + nums[right] < target)left++;
            else if(nums[left] + nums[right] > target)right--;
            else return new int[] {left+1, right+1};

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{2,7,11,15};
        int target=9;
        int[] res=twoSum(numbers,target);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
}
