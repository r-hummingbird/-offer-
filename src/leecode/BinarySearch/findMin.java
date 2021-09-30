package leecode.BinarySearch;

public class findMin {
    public static int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, mid = 0;
        while (l<=r){
            mid=l+(r-l)/2;
            if (nums[mid]<nums[r]){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
