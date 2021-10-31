package leecode.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class coinChange {
    public static int coinChange(int[] coins, int amount) {
        int res=Integer.MAX_VALUE;
        Arrays.stream(coins);
        if (coins.length==0)
            return -1;
        int[] dp=new int[amount+1];
        for (int i = 0; i <dp.length ; i++) {
            dp[i]=res;
        }
        dp[0]=0;
        for (int i = 0; i <coins.length ; i++) {
            for (int j = coins[i]; j <=amount ; j++) {
                if (dp[j-coins[i]]!=res){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount]==res?-1:dp[amount];
    }

    public static void main(String[] args) {
        int[] coins=new int[]{1,2,5};
        int amount=11;
        System.out.println(coinChange(coins,amount));
    }
}
