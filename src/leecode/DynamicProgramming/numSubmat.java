package leecode.DynamicProgramming;

public class numSubmat {
    public static int numSubmat(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int[][] dp=new int[m][n];
        int sum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (mat[i][j]==0)
                    continue;
                dp[i][j]=j==0?1:dp[i][j-1]+1;
                int min=Integer.MAX_VALUE;
                for (int k = 0; k <=i ; k++) {
                    if (mat[i-k][j]==0)
                        break;
                    min=Math.min(min,dp[i-k][j]);
                    sum+=min;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{0,1,1,0},{0,1,1,1},{1,1,1,0}};
        System.out.println(numSubmat(matrix));
    }
}
