package leecode.doublePoint;

import java.util.Arrays;

public class numSubseq {
    static int mod = 1000000007;
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int n=nums.length;
        int[] pow = new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i]=pow[i-1]*2%mod;
        }
        int left=0,right=n-1;
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                res+=pow[right-left];
                res%=mod;
                left++;
            }
            else
                right--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,5,6,7};
        int target=9;
        System.out.println(numSubseq(nums,target));
    }
}
