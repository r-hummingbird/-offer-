package jianzhioffer;

public class maxProfit {
    public static int maxProfit(int[] prices) {

        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int maxP = 0,minP= prices[0];
        for(int i =1;i<prices.length;i++) {
            if (prices[i] > minP)
                maxP = Math.max(maxP, prices[i] - minP);
            else
                minP = prices[i];
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

}
