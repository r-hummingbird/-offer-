package leecode.backTrack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,res,0,new ArrayList<Integer>());
        return res;
    }

    private static void backTrack(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> tmp_list) {
        if (target<0){
            return;
        }if (target==0){
            res.add(new ArrayList<>(tmp_list));
        }
        for (int j = i; j <candidates.length ; j++) {
            if (target<0)
                break;
            tmp_list.add(candidates[j]);
            backTrack(candidates,target-candidates[j],res,j,tmp_list);
            tmp_list.remove(tmp_list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates=new int[]{2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
}
