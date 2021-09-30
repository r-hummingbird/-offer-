package leecode.BinarySearch;

public class findDuplicate {
    public static int findDuplicate(int[] nums) {
        int l=1;
        int r=nums.length;
        while (l<r){
            int mid=l+(r-l)/2;
            int cnt=0;
            for (int num:nums){
                if (num<=mid){
                    cnt++;
                }
            }
            if (cnt<=mid){
                l=mid+1;
            }else {
                r=mid;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
