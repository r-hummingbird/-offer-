package leecode.array;

import java.lang.reflect.Array;
import java.util.*;

public class thirdMax {
    public static int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        Integer first = null, second = null, third = null;
        for(int i = 0; i < nums.length; i++) {
            Integer cur = nums[i];
            if(cur.equals(first) || cur.equals(second) || cur.equals(third)) continue;
            if(first == null || cur > first) {
                third = second;
                second = first;
                first = cur;
            } else if(second == null || cur > second) {
                third = second;
                second = cur;
            } else if(third == null || cur > third) {
                third = cur;
            }
        }
        return third == null ? first : third;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,3,2,1};
        System.out.println(thirdMax(nums));
    }
}
