package leecode.array;

import java.util.Arrays;

public class dominantIndex {
    public static int dominantIndex(int[] nums) {
        int[] temp=new int[nums.length];
        System.arraycopy(nums,0,temp,0,nums.length);
        Arrays.sort(nums);
        if (nums.length==1)
            return 0;
        if (nums[nums.length-1]>=2*nums[nums.length-2]){
            for (int i = 0; i <nums.length ; i++) {
                if (temp[i]==nums[nums.length-1])

                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
}
