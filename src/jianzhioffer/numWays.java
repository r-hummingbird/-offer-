package jianzhioffer;

import java.util.Scanner;

public class numWays {
    public static int numWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int x = 1;x <= n;x++){
            dp[x] = dp[x - 1];
            if(x > 1)
                dp[x] = (int)((dp[x] + dp[x - 2]) % (1e9 + 7)) ;
        }
        return dp[n];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(numWays(num));
    }
}
