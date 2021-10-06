package jianzhioffer;

public class numSubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,r=0,count=0, product=1;
        while (r<nums.length){
            product*=nums[r++];
            while (l<r&&product>=k){
                product/=nums[l++];
            }
            count+=r-l;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{10,5,2,6};
        int k=100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
