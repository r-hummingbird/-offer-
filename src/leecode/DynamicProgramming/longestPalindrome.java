package leecode.DynamicProgramming;

public class longestPalindrome {
    public static String longestPalindrome(String s) {
        if (s.length()<=1)
            return s;
        int len=s.length();
        int maxLen=1;
        int l=0;
        boolean[][] dp=new boolean[len][len];
        for (int i = 0; i <len ; i++) {
            dp[i][i]=true;
        }
        char[] ch=s.toCharArray();
        for (int L = 2; L <=len ; L++) {
            for (int i = 0; i <len ; i++) {
                int j=L+i-1;
                if (j>=len){
                    break;
                }
                if (ch[i]!=ch[j]){
                    dp[i][j]=false;
                }else {
                    if (j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    l=i;
                }
            }
        }
        return s.substring(l,l+maxLen);
    }

    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}
