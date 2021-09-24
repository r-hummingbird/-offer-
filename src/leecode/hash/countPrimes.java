package leecode.hash;

import java.util.HashSet;
import java.util.Set;

public class countPrimes {
    public static int countPrimes(int n) {
        int count=0;
        boolean[] flag=new boolean[n];
        for(int i=2;i<=Math.sqrt(n);i++){
            //如果是质数，就把所有质数的倍数设定为非质数
            if(!flag[i])
                for(int j=i*i;j<n;j+=i){
                    flag[j]=true;
                }
        }
        //遍历计算质数个数
        for(int i=2;i<n;i++){
            if(!flag[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(countPrimes(n));
    }
}
