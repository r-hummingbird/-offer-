package leecode.doublePoint;


import java.util.HashSet;


public class findPairs {
    public static int findPairs(int[] nums, int k) {
        HashSet<Object> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (Math.abs(nums[i] - nums[j])==k){
                    set.add(nums[i] + nums[j]);
                }
            }
        }
        return set.size();
     }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        int k=2;
        System.out.println(findPairs(nums,k));
    }
}
