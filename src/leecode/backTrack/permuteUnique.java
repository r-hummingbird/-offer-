package leecode.backTrack;

import java.util.*;


public class permuteUnique {
    static List<List<Integer>> ans=new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        backTrack(nums,0);
        return ans;
    }

    private static void backTrack(int[] nums, int cur) {
        if (cur == nums.length) {
            List<Integer> line = new ArrayList<>();
            for (int i : nums) {
                line.add(i);
            }
            ans.add(line);
        } else {
            for (int i = cur; i <nums.length ; i++) {
                if (exist(nums,cur,i)) {
                    swap(nums,cur,i);
                    backTrack(nums,cur + 1);
                    swap(nums,cur,i);
                }
            }
        }
    }

    private static boolean exist(int[] nums, int begin, int end) {
        for (int i = begin;i < end;i++) {
            if (nums[i] == nums[end]) {
                return false;
            }
        }

        return true;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,2};
        System.out.println(permuteUnique(nums));
    }

}
