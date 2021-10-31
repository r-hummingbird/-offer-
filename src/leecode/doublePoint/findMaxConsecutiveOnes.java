package leecode.doublePoint;

public class findMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        if (nums.length == 0 || nums == null){
            return 0;
        }
        int i =0;
        int temp = 0;
        while ( i < nums.length){
            if (nums[i++] == 1){
                count++;
                temp = Math.max(count,temp);
            }else {
                count = 0;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
