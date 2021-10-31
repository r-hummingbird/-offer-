package leecode.backTrack;

import java.util.ArrayList;
import java.util.List;

public class permute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int[] visited=new int[nums.length];
        backTrack(res,nums,new ArrayList<Integer>(),visited);
        return res;
    }

    private static void backTrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> temp, int[] visited) {
        if (temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (visited[i]==1)
                continue;
            visited[i]=1;
            temp.add(nums[i]);
            backTrack(res,nums,temp,visited);
            visited[i]=0;
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1};
        System.out.println(permute(nums));
    }
}
