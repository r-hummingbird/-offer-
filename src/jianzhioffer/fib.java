package jianzhioffer;

import java.util.Scanner;

public class fib {
    public static int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int a = 1, b = 0;
        for (int i = 1; i < n; i++) {
            a = a + b;
            b = a - b;
            a %= 1000000007;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fib(num));
    }
}
