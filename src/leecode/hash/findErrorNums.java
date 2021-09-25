package leecode.hash;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int[] counter = new int[nums.length+1];

        for (int i: nums) {
            counter[i]++;
        }

        int[] result = new int[2];
        for (int i = 1; i<counter.length; i++) {
            if (counter[i] == 0) {
                result[1] = i;
            } else if (counter[i] == 2) {
                result[0] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,2,3,4,5,6};
        int[] res=findErrorNums(nums);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
