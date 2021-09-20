package jianzhioffer;

import java.util.PriorityQueue;

public class MedianFinder {
    /** initialize your data structure here. */
    static PriorityQueue<Integer> maxHeap;//大顶
    static PriorityQueue<Integer> minHeap;//小顶
    public MedianFinder() {
        maxHeap=new PriorityQueue<>((n1,n2)->n2-n1);
        minHeap=new PriorityQueue<>();
    }

    public static void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if(minHeap.size()+1<minHeap.size())
            maxHeap.add(minHeap.poll());

    }

    public static double findMedian() {
        if(minHeap.size()>maxHeap.size())return minHeap.peek();
        return (double)(minHeap.peek()+maxHeap.peek())/2;

    }

    public static void main(String[] args) {
        MedianFinder mf=new MedianFinder();
        mf.addNum(4);
        mf.addNum(2);
        mf.addNum(3);
        System.out.println(findMedian());
    }
}
