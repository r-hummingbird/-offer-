package jianzhioffer;

public class searchInsert {
    public static int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if (nums[mid]<target){
                l=mid+1;
            }
            if (nums[mid]>target){
                r=mid-1;
            }
            if (nums[mid]==target)
                return mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));
    }
}
