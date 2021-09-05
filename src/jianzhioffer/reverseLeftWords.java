package jianzhioffer;

import java.util.Scanner;

public class reverseLeftWords {
    public static String reverseLeftWords(String s, int n) {
        char[]arr = s.toCharArray();
        int len = arr.length;
        char[]res = new char[len];
        for(int i =0;i<len;i++){
            res[i] = arr[(i+n)%len];
        }
        System.out.println(String.valueOf(res));
        return String.valueOf(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int num=sc.nextInt();
        reverseLeftWords(st,num);


    }
}
