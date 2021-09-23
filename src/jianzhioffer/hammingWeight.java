package jianzhioffer;

public class hammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);

        }
        return count;
    }

    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
}
