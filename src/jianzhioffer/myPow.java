package jianzhioffer;
//完全没想过这种解法
public class myPow {
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return half * half * mod;
    }

    public static void main(String[] args) {
        double x=2.0000;
        int n=3;
        System.out.println(myPow(x,n));
    }
}
