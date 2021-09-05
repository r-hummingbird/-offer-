package jianzhioffer;

import java.util.Scanner;

public class replaceSpace {
    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') sb.append("%20");
            else sb.append(c);
        }
        System.out.print(sb);
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);
        replaceSpace(st);


    }
}
