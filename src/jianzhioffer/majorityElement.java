package jianzhioffer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)> nums.length>>1) return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }
}
