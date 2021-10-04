package jianzhioffer;

public class findNthDigit {
    public static int findNthDigit(int n) {
        if (n==0)
            return 0;
        int num=1;
        long start=1;
        long count=9;
        while (n>count){
            n-=count;
            num++;
            start*=10;
            count=num*start*9;
        }
        long num1=start+(n-1)/num;
        return Long.toString(num1).charAt((n-1)%num)-'0';
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(findNthDigit(n));
    }
}
