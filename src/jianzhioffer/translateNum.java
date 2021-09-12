package jianzhioffer;

import java.util.Scanner;

public class translateNum {
    public static int translateNum(int num) {
        if(num < 10){
            return 1;
        }
        else if(num < 26){
            return 2;
        }
        else if(num < 100){
            return 1;
        }
        if(num%100 > 25 || num%100 < 10){
            return translateNum(num/10);
        }
        else{
            return translateNum(num/10) + translateNum(num/100);
        }

    }

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(translateNum(num));
    }
}
