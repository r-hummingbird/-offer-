package jianzhioffer;

import java.util.TreeSet;

public class containsNearbyAlmostDuplicate {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k==0) return false;
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            Long f = set.floor((long)nums[i]);
            Long c = set.ceiling((long)nums[i]);
            if(f!=null&&nums[i]-f<=t||c!=null&&c-nums[i]<=t){
                return true;
            }
            if(set.size()==k){
                set.remove((long)nums[i-k]);
            }
            set.add((long)nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,1};
        int k=3,t=0;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
    }
}
