package leecode.DynamicProgramming;


public class climbStairs {
    public static int climbStairs(int n) {
        if (n==1)
            return 1;
        if (n==0)
            return 1;
        int[] nums=new int[n+1];
        nums[0]=1;
        nums[1]=1;
        for (int i = 2; i <nums.length ; i++) {
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(climbStairs(n));
    }
}
