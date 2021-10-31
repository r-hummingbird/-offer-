package jianzhioffer;

import java.util.HashMap;

public class minEatingSpeed {
    public static int minEatingSpeed(int[] piles, int h) {
        int res=0;
        int sum=0,maxElem=-1;
        for (int pile:piles){
            sum+=pile;
            maxElem=Math.max(maxElem,pile);
        }
        long l=1,r=maxElem;
        while (l<=r){
            long mid=l+(r-l)/2;
            boolean canEat=check(piles,mid, h);
            if (canEat){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return (int)l;
    }

    private static boolean check(int[] piles, long mid, int h) {
        int needHour=0;
        for (int pile:piles){
            if (pile%mid==0){
                needHour+=pile/mid;
            }else {
                needHour+=pile/mid+1;
            }
        }
        return needHour<=h;
    }

    public static void main(String[] args) {
        int[] piles=new int[]{3,6,7,11};
        int H=8;
        System.out.println(minEatingSpeed(piles,H));
    }
}
