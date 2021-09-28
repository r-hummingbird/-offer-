package jianzhioffer;

public class spiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        int row =matrix.length;
        int col=matrix[0].length;
        if (row == 0) {
            return new int[0];
        }
        int[] res = new int[row * col];
        int index=0;
        int left=0,top=0,right=col-1,bottom=row-1;
        while (true){
            for (int i = left; i <=right ; i++) {
                res[index++]=matrix[top][i];
            }
            if (++top>bottom){
                break;
            }
            for (int i = top; i <=bottom ; i++) {
                res[index++]=matrix[i][right];
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                res[index++] = matrix[bottom][i];
            }
            if (--bottom < top) {
                break;
            }
            //从下往上走
            for (int i = bottom; i >= top; i--) {
                res[index++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] res=spiralOrder(matrix);
        for (int result:res){
            System.out.print(result+" ");
        }
    }
}
