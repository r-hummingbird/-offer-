package jianzhioffer;

public class countSubstrings {
    public static int countSubstrings(String s) {
        int len=s.length();
        boolean[][] dp=new boolean[len][len];
        int res=0;
        for (int i = len-1; i >=0 ; i--) {
            for (int j = i; j <len ; j++) {
                if (s.charAt(i)==s.charAt(j)&&((j-i<=1)||dp[i+1][j-1])){
                    dp[i][j]=true;
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s="abc";
        System.out.println(countSubstrings(s));
    }
}
