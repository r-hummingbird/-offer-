package leecode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class minimumTotal {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null||triangle.size()==0)
            return 0;
        int[][]dp=new int[triangle.size()+1][triangle.size()+1];
        for (int i = triangle.size()-1; i >=0 ; i--) {
            List<Integer> curTr=triangle.get(i);
            for (int j = 0; j <curTr.size() ; j++) {
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + curTr.get(j);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        System.out.println(minimumTotal(triangle));
    }
}
