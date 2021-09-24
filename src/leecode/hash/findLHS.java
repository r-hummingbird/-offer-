package leecode.hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class findLHS {
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start=0,res=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]-nums[start]>1){
                start++;
            }
            if (nums[i]-nums[start]==1){
                res= Math.max(res,i-start+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
