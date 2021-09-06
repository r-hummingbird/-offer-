package jianzhioffer;

import java.util.Random;

public class missingNumber {
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 数组下标是从0开始连续的向n增长，若相等范围区域继续向右靠
            if (nums[mid] == mid) {
                left = mid + 1;
            }
            // 不相范围区域向左靠拢
            else {
                right = mid - 1;
            }
        }
        
        return left;
    }

    public static void main(String[] args) {
        Random rand=new Random();
        int num=rand.nextInt(100);
        System.out.println("num "+num);
        int target=rand.nextInt(num);
        System.out.println("target "+target);
        int[] arr1=new int[num];
        for (int i = 0; i <arr1.length ; i++) {
            if (i<target)
                arr1[i]=i;
            else
                arr1[i]=i+1;
        }
        int missing=missingNumber(arr1);
        System.out.println("missing "+missing);


    }
}
