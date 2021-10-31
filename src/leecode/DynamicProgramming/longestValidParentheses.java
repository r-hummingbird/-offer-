package leecode.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class longestValidParentheses {
    public static int longestValidParentheses(String s) {
        if (s.length()==0)
            return 0;
        int n=s.length();
        int[] dp=new int[n];
        for (int i = 1; i <n ; i++) {
            if (s.charAt(i)==')'){
                int pre=i-dp[i-1]-1;
                if (pre>=0&&s.charAt(pre)=='('){
                    dp[i]=dp[i-1]+2;
                    if (pre >0)
                        dp[i]+=dp[pre-1] ;
                }
            }
        }
        Arrays.sort(dp);
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        String s="(()";
        System.out.println(longestValidParentheses(s));
    }
}
