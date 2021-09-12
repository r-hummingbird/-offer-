package jianzhioffer;

import java.util.Scanner;

public class sumNums {
    public static int sumNums(int n) {
        int sum=n;
        boolean flag=n>0&& (sum += sumNums(n - 1)) > 0;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sumNums(num));
    }
}
