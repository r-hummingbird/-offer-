package leecode.DynamicProgramming;

public class minPathSum {
    public static int minPathSum(int[][] grid) {
      int m=grid.length,n=grid[0].length;
      if (m==0||n==0)
          return 0;
      for (int i=1;i<m;i++){
          grid[i][0]+=grid[i-1][0];
      }
      for (int i=1;i<n;i++){
          grid[0][i]+=grid[0][i-1];
      }
      for (int i = 1; i <m ; i++) {
          for (int j = 1; j <n ; j++) {
              grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
          }
      }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid=new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
