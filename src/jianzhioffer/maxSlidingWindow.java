package jianzhioffer;

import java.util.PriorityQueue;

public class maxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0||k<0){
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1); /* 大顶堆 */
        for(int i=0;i<k;i++) {
            heap.add(nums[i]);
        }
        res[0] = heap.peek();
        for(int i=0,j=i+k;j<nums.length;i++,j++) { /* 维护一个大小为 size 的大顶堆 */
            heap.remove(nums[i]);
            heap.add(nums[j]);
            res[i + 1] = heap.peek();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] result=maxSlidingWindow(nums,k);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
