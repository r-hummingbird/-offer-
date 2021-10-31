package leecode.DynamicProgramming;

public class minFallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int n=matrix.length,res=Integer.MAX_VALUE;
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (j==0){
                    matrix[i][j]+=Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                }else if (j==n-1){
                    matrix[i][j]+=Math.min(matrix[i-1][j-1],matrix[i-1][j]);
                }else {
                    matrix[i][j]+=Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i-1][j+1]));
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            res =Math.min(res,matrix[n-1][i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }
}
