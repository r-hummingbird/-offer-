package leecode.array;

public class numMagicSquaresInside {
    public static int numMagicSquaresInside(int[][] grid) {
        int res = 0,n = grid.length,m = grid[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i+2<n&&j+2<n&&check(grid,i,j)) res++;
            }
        }
        return res;
    }

    private static boolean check(int[][] grid, int i, int j) {
        int[] cnt = new int[10];
        int[] cols = new int[3];
        int[] rows = new int[3];
        int a = 0,b = 0;
        for(int r = 0;r<3;r++){
            for(int c = 0;c<3;c++){
                if(grid[i+r][j+c]>9) return false;
                cnt[grid[i+r][j+c]]++;
                rows[r]+=grid[i+r][j+c];
                cols[c]+=grid[i+r][j+c];
                if(r==c) a+=grid[i+r][j+c];
                if(r+c==2) b+=grid[i+r][j+c];
            }
        }
        for(int t = 1;t<=9;t++) if(cnt[t]!=1) return false;
        int tmp = a;
        if(b!=tmp) return false;
        for(int num:rows) if(num!=tmp) return false;
        for(int num:cols) if(num!=tmp) return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] grid=new int[][]{{4,3,8,4},{9,5,1,9},{2,7,6,2}};
        System.out.println(numMagicSquaresInside(grid));
    }
}
