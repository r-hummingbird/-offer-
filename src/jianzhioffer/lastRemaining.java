package jianzhioffer;

public class lastRemaining {
    public static int lastRemaining(int n, int m) {
        if (n==1) return 0;
        return (lastRemaining(n-1,m)+m)%n;
    }

    public static void main(String[] args) {
        int n=5,m=3;
        System.out.println(lastRemaining(n,m));

    }
}
