package jianzhioffer;

public class maxValue {
    public static int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1]) + grid[i - 1][j - 1];
            }
        }

        return dp[n];

    }

    public static void main(String[] args) {
        int[][] num={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(maxValue(num));

    }
}
