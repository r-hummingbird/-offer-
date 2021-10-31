package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

public class findMaxLength {
    public static int findMaxLength(int[] nums) {
        int count=0,sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        // 和为0的时候的下标是-1,当起始区间的和是0的时候,用到哨兵
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                nums[i]=-1;
            }
            sum+=nums[i];
            // 对于区间求和, 如果sum-0 == sum1 存在map中,相当于sum - sum1 = 0
            // 那么这一段区间之和就是0
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else {
                count=Math.max(i-map.get(sum),count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1};
        System.out.println(findMaxLength(nums));
    }
}
