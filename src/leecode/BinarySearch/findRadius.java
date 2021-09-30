package leecode.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findRadius {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i=0;
        int radius=0;
        for (int house:houses){
            while(i<heaters.length&&heaters[i]<house){
                i++;
            }
            if (i==0){
                radius=Math.max(radius,heaters[i]-house);
            }else if (i==heaters.length){
                return Math.max(radius,houses[houses.length-1]- heaters[heaters.length-1]);
            }else {
                radius=Math.max(radius,Math.min(heaters[i] - house, house - heaters[i - 1]));
            }
        }
        return radius;
    }

    public static void main(String[] args) {
        int[] houses=new int[]{1,2,3};
        int[] heaters=new int[]{2};
        System.out.println(findRadius(houses,heaters));
    }
}
