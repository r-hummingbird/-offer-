package jianzhioffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums==null)
            return null;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i = 0;i<n-2;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int l = i+1, r = n-1;
            while(l<r){
                if(nums[l]+nums[r]==target){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    int tmp = nums[l];
                    while(l<r&&nums[l]==tmp) l++;
                    tmp = nums[r];
                    while(l<r&&nums[r]==tmp) r--;
                }else if(nums[l]+nums[r]<target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> res=threeSum(nums);
        System.out.println(res);
    }
}
