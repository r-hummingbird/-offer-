package jianzhioffer;

import java.awt.desktop.QuitEvent;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxQueue {
   static Deque<Integer> queue;
   static Deque<Integer> maxValue;
    public MaxQueue() {
        queue=new ArrayDeque<>();
        maxValue=new ArrayDeque<>();
    }

    public static int max_value() {
        if (queue.isEmpty())
            return -1;
        return maxValue.peek();
    }

    public static void push_back(int value) {
        queue.offer(value);
        while (!maxValue.isEmpty()&&value>maxValue.peekLast()){
            maxValue.pollLast();
        }
        maxValue.offer(value);
    }

    public static int pop_front() {
        if (queue.isEmpty()){
            return -1;
        }
        int val=queue.pop();
        if (maxValue.peek()==val){
            maxValue.pop();
        }
        return val;

    }

    public static void main(String[] args) {
        MaxQueue obj = new MaxQueue();
        obj.push_back(1);
        obj.push_back(2);
        int param_1 = obj.max_value();
        int param_3 = obj.pop_front();
        int param_4 = obj.max_value();
        System.out.println(param_1+" "+param_3+" "+param_4);
    }
}

