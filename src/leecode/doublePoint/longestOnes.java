package leecode.doublePoint;

public class longestOnes {
    public static int longestOnes(int[] nums, int k) {
        int l=0,r=0,res=0;
        while (r<nums.length){
            if (nums[r]==0){
                if (k==0){
                    while (nums[l]==1)l++;
                    l++;
                }else {
                    k--;
                }
            }
            res =Math.max(res,++r-l);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nusm=new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(nusm,k));
    }
}
