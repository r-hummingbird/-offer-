package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecentCounter {
    static Queue<Integer> list;
    public RecentCounter() {
        list=new LinkedList<>();
    }

    public int ping(int t) {
        list.offer(t);
        while (list.peek()<t-3000){
            list.poll();
        }
        return list.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        int param_1 =recentCounter.ping(1);
        System.out.println(param_1);
        int param_2 =recentCounter.ping(100);
        System.out.println(param_2);
        int param_3 =recentCounter.ping(3001);
        System.out.println(param_3);
        int param_4 =recentCounter.ping(3002);
        System.out.println(param_4);
    }
}
