package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class printNumbers {
    public static int[] printNumbers(int n) {
        int m= (int)Math.pow(10,n);
        int[] a = new int[m-1];
        for(int i=0;i<m-1;i++){
            a[i] = i+1;
        }
        return a;
    }

    public static void main(String[] args) {
        int n=1;
        int[] num=printNumbers(n);
        for (int item:num){
            System.out.print(item);
        }
    }
}
