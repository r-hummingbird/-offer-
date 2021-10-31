package leecode.DynamicProgramming;

public class maxProfit {
    public static int maxProfit(int[] prices) {
        int maxP=0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]-prices[i-1]>0){
                maxP+=prices[i]-prices[i-1];
            }
        }
        return maxP;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
