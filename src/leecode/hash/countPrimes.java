package leecode.hash;

import java.util.HashSet;
import java.util.Set;

public class countPrimes {
    public static int countPrimes(int n) {
        int count=0;
        boolean[] flag=new boolean[n];
        if (n==0||n==1){
            count=0;
        }
        for(int i=2;i<n;i++){
            if(!flag[i]){
                count++;
                for(int j=i+i;j<n;j+=i)
                    flag[j]=true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(countPrimes(n));
    }
}
