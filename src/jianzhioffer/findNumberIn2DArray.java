package jianzhioffer;


public class findNumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)    return false;
        int x = matrix.length - 1, y = 0;
        while (x >= 0 && y < matrix[0].length)
        {
            if (matrix[x][y] == target) return true;
            if (matrix[x][y] < target)
            {
                y++;
            }
            else
            {
                x--;
            }
        }//只可能向上或者向右查找，因为其他方向的查找毫无意义

        return false;
    }


    public static void main(String[] args) {

        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target=12;
        System.out.println("存在target是否为真"+findNumberIn2DArray(arr,target));
    }
}
