package leecode.doublePoint;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class merge {
    public static int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= res.getLast()[1]) {
                int start = res.getLast()[0];
                int end = Math.max(intervals[i][1], res.getLast()[1]);
                res.removeLast();
                res.add(new int[]{start, end});
            }
            else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }



    public static void main(String[] args) {
        int[][] intervals=new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] res=merge(intervals);
        for (int[] items:res){
            for (int item:items){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
