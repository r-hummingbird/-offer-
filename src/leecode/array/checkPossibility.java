package leecode.array;

import java.lang.reflect.Array;
import java.util.Arrays;
//找数组中第一个 nums[i]>nums[i+1] 的 i 点，没找到直接true
//找到了后，解决办法有两种：
//          1） nums[i] = nums[i+1]
//          2)   nums[i+1] = nums[i]
//按照任意一种方法更改完数组后若是非递减数列则true，否则false
public class checkPossibility {
    public static boolean checkPossibility(int[] nums) {
        int cnt = 0, len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }

        return cnt < 2;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,2,1};
        System.out.println(checkPossibility(nums));
    }
}
