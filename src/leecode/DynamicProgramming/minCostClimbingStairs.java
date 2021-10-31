package leecode.DynamicProgramming;

public class minCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        //前一  前二 哪个更小
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<n;i++){
            dp[i] = Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }

    public static void main(String[] args) {
        int[] cost=new int[]{10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
