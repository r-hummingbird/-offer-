package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

public class dicesProbability {
    public static double[] dicesProbability(int n) {
        //n个骰子,第一维表示是多少骰子，第二维表示是多少点数，数组的值表示是多少次
        int[][] dp=new int[n+1][6*n+1];
        double[] ans=new double[5*n+1];
        double all=Math.pow(6,n);
        for(int i=1;i<=6;i++)
            dp[1][i]=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=6*n;j++){
                for(int k=1;k<=6;k++){
                    dp[i][j]+=j>=k?dp[i-1][j-k]:0;
                    if(i==n)
                        ans[j-i]=dp[i][j]/all;
                }
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        int i=1;
        double[] res=dicesProbability(i);
        for (double item:res){
            System.out.print(item+" ");
        }
    }
}
