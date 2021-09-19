package jianzhioffer;

import java.util.Arrays;

public class isStraight {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;// record the number of zero
        for(int i = 0; i < 4; i ++){
            if(nums[i] == 0) count ++;
            else{
                if(nums[i + 1] - nums[i] > count + 1 || nums[i + 1] == nums[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        System.out.println(isStraight(nums));
    }
}
