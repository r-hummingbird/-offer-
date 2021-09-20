package jianzhioffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class getLeastNumbers {
    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        if (arr==null)
            return null;
        int[] result=new int[k];
        for (int i = 0; i <k ; i++) {
            result[i]=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,2,1};
        int k=2;
        int[] result=getLeastNumbers(arr,k);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }

}
