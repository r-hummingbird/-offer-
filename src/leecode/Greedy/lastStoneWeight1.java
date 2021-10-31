package leecode.Greedy;

public class lastStoneWeight1 {
    public static int lastStoneWeightII(int[] stones) {
        int sum=0;
        for (int weight:stones){
            sum+=weight;
        }
        int n=stones.length;
        int m=sum/2;
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        for (int i = 0; i <n ; ++i) {
            for (int j = 0; j <=m ; ++j) {
                if (j<stones[i]){
                    dp[i+1][j]=dp[i][j];
                }else {
                    dp[i + 1][j] = dp[i][j] || dp[i][j - stones[i]];
                }
            }
        }
        for (int j=m;;--j){
            if (dp[n][j]){
                return sum-2*j;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeightII(nums));
    }
}
