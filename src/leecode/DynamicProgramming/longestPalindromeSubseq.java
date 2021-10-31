package leecode.DynamicProgramming;

public class longestPalindromeSubseq {
    public static int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for (int i = 0; i <n ; i++) {
            dp[i][i]=1;
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = i+1; j <n ; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
}
