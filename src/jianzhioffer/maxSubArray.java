package jianzhioffer;

import java.util.Scanner;

public class maxSubArray {


    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i < nums.length;i++){
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next().toString();
        String[] arr  = str.split(",");
        int[] num=new int[arr.length];
        for (int i = 0; i <num.length ; i++) {
            num[i]=Integer.parseInt(arr[i]);
        }
        int maxSubArray=maxSubArray(num);
        System.out.println(maxSubArray);

    }
}
