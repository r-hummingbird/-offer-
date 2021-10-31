package leecode.DynamicProgramming;

public class maxProfit4 {
    public static int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        if (n==0)
            return 0;
        int[] sell=new int[n];
        int[] buy=new int[n];
        buy[0]=-prices[0];
        for (int i = 1; i <n ; i++) {
            sell[i]=Math.max(buy[i-1]+prices[i]-fee,sell[i-1]);
            buy[i]=Math.max(sell[i-1]-prices[i],buy[i-1]);
        }
        return sell[n-1];
    }

    public static void main(String[] args) {
        int[] prices=new int[]{1, 3, 2, 8, 4, 9};
        int fee=2;
        System.out.println(maxProfit(prices,fee));
    }
}
