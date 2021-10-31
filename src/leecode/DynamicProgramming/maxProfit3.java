package leecode.DynamicProgramming;

public class maxProfit3 {
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        if (n==0)
            return 0;
        int[] sell=new int[n];
        int[] buy=new int[n];
        int[] cool=new int[n];
        buy[0]=-prices[0];
        for (int i = 1; i <n ; i++) {
            sell[i]=Math.max(buy[i-1]+prices[i],sell[i-1]);
            buy[i]=Math.max(cool[i-1]-prices[i],buy[i-1]);
            cool[i]=Math.max(sell[i-1],Math.max(buy[i-1],cool[i-1]));
        }
        return sell[n-1];
    }

    public static void main(String[] args) {
        int[] prices=new int[]{1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }
}
