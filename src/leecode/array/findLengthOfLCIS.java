package leecode.array;

import java.util.Arrays;

public class findLengthOfLCIS {
    public static int findLengthOfLCIS(int[] nums) {
        int maxlength=0,length=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]<nums[i+1]){
                length++;
            }else {
                length=0;
            }
            if (maxlength<length)
                maxlength=length;
        }
        return maxlength+1;


    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }
}
