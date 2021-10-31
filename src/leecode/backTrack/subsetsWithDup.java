package leecode.backTrack;

import java.util.*;

public class subsetsWithDup {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            int all=res.size();
            for (int j = 0; j <all ; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                if (!set.contains(tmp)) {
                    res.add(tmp);
                    set.add(tmp);
                }else {
                    continue;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
