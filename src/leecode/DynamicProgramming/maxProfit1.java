package leecode.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxProfit1 {
    public static int maxProfit(int[] prices) {
        //dp[天数][当前是否持股][卖出的次数]
        int n=prices.length;
        int[][][] dp=new int[n+1][2][3];
        for (int i = n-1; i >=0; i--) {
            for (int j = 1; j >=0 ; j--) {
                for (int k = 2; k >=0 ; k--) {
                    if (k==2&&j==0){
                        continue;
                    }
                    if (j>0){
                        dp[i][j][k]=Math.max(prices[i]+dp[i+1][0][k],dp[i+1][1][k]);
                    }else {
                        dp[i][j][k] = Math.max(-prices[i] + dp[i+1][1][k+1], dp[i+1][0][k]);
                    }
                }
            }
        }
        return dp[0][0][0];
    }

    public static void main(String[] args) {
        int[] prices=new int[]{3,2,6,5,0,3};
        System.out.println(maxProfit(prices));
    }
}
