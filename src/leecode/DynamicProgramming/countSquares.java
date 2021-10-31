package leecode.DynamicProgramming;

import jianzhioffer.MovingAverage;

public class countSquares {
    public static int countSquares(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int[][] dp=new int[m+1][n+1];
        int sum = 0;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(matrix[i-1][j-1] == 1)
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                else
                    dp[i][j] = 0;
                sum += dp[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        System.out.println(countSquares(matrix));
    }
}
