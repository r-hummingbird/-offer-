package leecode.DynamicProgramming;

public class stoneGame {
//    dp[i][j]表示从第i到j堆石头，Alex（先手）能领先Lee（后手）的最大分值。
//            1.Alex拿走第j堆，则相当于变成：Alex初始分数为piles[j-1]，第i到j-1堆，且Lee先手。
//    dp[i][j] = piles[j-1] + (-dp[i][j-1])
//            2.Alex拿走第i堆，则相当于变成：Alex初始分数为piles[i-1]，第i+1到j堆，且Lee先手。
//    dp[i][j] = piles[i-1] + (-dp[i+1][j])
//    二者取大。
    public static boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] f = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) { // 枚举区间长度
            for (int l = 1; l + len - 1 <= n; l++) { // 枚举左端点
                int r = l + len - 1; // 计算右端点
                int a = piles[l - 1] - f[l + 1][r];
                int b = piles[r - 1] - f[l][r - 1];
                f[l][r] = Math.max(a, b);
            }
        }
        return f[1][n] > 0;
    }

    public static void main(String[] args) {
        int[] piles=new int[]{5,3,4,5};
        System.out.println(stoneGame(piles));
    }
}
