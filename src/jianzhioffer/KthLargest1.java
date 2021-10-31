package jianzhioffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargest1 {
    static PriorityQueue<Integer> minHeap;
    static PriorityQueue<Integer> maxHeap;
    static int k;
    public KthLargest1(int k, int[] nums) {

        this.k=k;
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            add(num);
        }
    }

    public static int add(int val) {
        if (minHeap.size() < k) {
            minHeap.add(val);
            return minHeap.peek();
        }
        maxHeap.add(val);
        if (maxHeap.peek() > minHeap.peek()) {
            minHeap.add(maxHeap.poll());
            maxHeap.add(minHeap.poll());
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4, 5, 8, 2};
        KthLargest1 obj = new KthLargest1(3, nums);
        int param_1 = obj.add(3);
        System.out.println(param_1);
    }
}
