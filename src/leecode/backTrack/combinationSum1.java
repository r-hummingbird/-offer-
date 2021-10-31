package leecode.backTrack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum1 {
    static List<int[]> freq=new ArrayList<int[]>();
    static List<List<Integer>> ans=new ArrayList<List<Integer>>();
    static List<Integer> sequence=new ArrayList<Integer>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int num:candidates){
            int size=freq.size();
            if (freq.isEmpty()||num!=freq.get(size-1)[0]){
                freq.add(new int[]{num,1});
            }else {
                ++freq.get(size-1)[1];
            }
        }
        backTrack(0,target);
        return ans;
    }

    private static void backTrack(int pos,int rest) {
        if (rest==0){
            ans.add(new ArrayList<Integer>(sequence));
            return;
        }
        if (pos==freq.size()||rest<freq.get(pos)[0]){
            return;
        }
        backTrack(pos+1,rest);
        int most=Math.min(rest / freq.get(pos)[0], freq.get(pos)[1]);
        for (int i = 1; i <= most; ++i) {
            sequence.add(freq.get(pos)[0]);
            backTrack(pos + 1, rest - i * freq.get(pos)[0]);
        }
        for (int i = 1; i <= most; ++i) {
            sequence.remove(sequence.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates=new int[]{2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
}
