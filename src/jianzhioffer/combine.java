package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class combine {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists=new ArrayList<>();
        backTrack(1,lists,new ArrayList<Integer>(),n,k);
        return lists;
    }

    private static void backTrack(int i, List<List<Integer>> lists, ArrayList<Integer> list, int n, int k) {
        if (list.size()==k){
            lists.add(new ArrayList<>(list));
        }else {
            for (int j = i; j <=n ; j++) {
                list.add(j);
                backTrack(j+1,lists,list,n,k);
                list.remove(new Integer(j));
            }
        }
    }

    public static void main(String[] args) {
        int n=4,k=2;
        System.out.println(combine(n,k));
    }
}
