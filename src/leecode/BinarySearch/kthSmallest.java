package leecode.BinarySearch;

public class kthSmallest {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length-1;
        int l = matrix[0][0], r = matrix[n][n];
        while(l < r) {
            int mid = l + (r-l)/2;
            int count = countNoMoreThanMid(matrix, mid, n);
            if(count < k) {
                l = mid+1;
            }
            else {
                r = mid;
            }
        }
        return r;
    }

    private static int countNoMoreThanMid(int[][] matrix, int mid, int n) {
        int x = n, y = 0, count = 0;
        while(x >= 0 && y <= n) {
            if(matrix[x][y] <= mid) {
                count += x + 1;
                ++ y;
            }else {
                -- x;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,5,9},{10,11,13},{12,13,15}};
        int k=8;
        System.out.println(kthSmallest(matrix,k));
    }
}
