package leecode.Greedy;

import jianzhioffer.MovingAverage;

import javax.print.attribute.standard.Finishings;
import java.lang.reflect.Array;
import java.util.Arrays;

public class lastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length==2){
            return Math.abs(stones[0]-stones[1]);
        }
        if (stones.length==1){
            return stones[0];
        }
        Arrays.sort(stones);
        if (stones[stones.length-3]==0){
            return stones[stones.length-1]-stones[stones.length-2];
        }
        stones[stones.length-1]=stones[stones.length-1]-stones[stones.length-2];
        stones[stones.length-2]=0;
        return lastStoneWeight(stones);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight(nums));
    }
}
