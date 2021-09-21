package leecode.array;

import java.util.Arrays;

import static java.lang.Math.abs;

public class fairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        int sumA = 0, sumB = 0;
        for(int i: aliceSizes){
            sumA += i;
        }
        for(int j: bobSizes){
            sumB += j;
        }
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int temp = sumA-(sumA+sumB)/2;
        int i = 0, j = 0;
        while(i<aliceSizes.length&&j<bobSizes.length) {
            if (aliceSizes[i] - bobSizes[j] == temp) {
                ans[0] = aliceSizes[i];
                ans[1] = bobSizes[j];
                break;
            } else if (aliceSizes[i] - bobSizes[j] > temp) {
                j++;
            } else if (aliceSizes[i] - bobSizes[j] < temp) {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A=new int[]{1,2,5};
        int[] B=new int[]{2,4};
        int[] result=fairCandySwap(A,B);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
