package leecode.DynamicProgramming;

public class minimumDeleteSum {
    public static int minimumDeleteSum(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for (int i = 0; i <=m ; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i <=n ; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+s1.charAt(i-1);
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int num=0;
        for (int i = 0; i <m ; i++) {
            num+=s1.charAt(i);
        }
        for (int i = 0; i <n ; i++) {
            num+=s2.charAt(i);
        }
        return num-2*dp[m][n];
    }

    public static void main(String[] args) {
        String s1="sea";
        String s2="eat";
        System.out.println(minimumDeleteSum(s1,s2));
    }
}
