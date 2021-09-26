package leecode.hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class findKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if(pq.size() < k){
                pq.add(num);
            }
            else if(pq.peek() < num){
                pq.remove();
                pq.add(num);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findKthLargest(nums,k));

    }
}
