package leecode.DynamicProgramming;

public class nthUglyNumber {
    public static int nthUglyNumber(int n) {
        if (n==1)
            return 1;
        int n2=0,n3=0,n5=0;
        int[] dp=new int[n];
        dp[0]=1;
        for (int i = 1; i <n ; i++) {
            dp[i]=Math.min(2*dp[n2],Math.min(3*dp[n3],5*dp[n5]));
            if (dp[i]==2*dp[n2])n2++;
            if (dp[i]==3*dp[n3])n3++;
            if (dp[i]==5*dp[n5])n5++;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(nthUglyNumber(n));
    }
}
