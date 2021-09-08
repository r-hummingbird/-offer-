package jianzhioffer;

import java.util.Scanner;

public class firstUniqChar {
    public static char firstUniqChar(String s) {
        int[] arr=new int[26];
        if (s.equals(""))
            return ' ';
        for (int i = 0; i <s.length() ; i++) {
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if (arr[s.charAt(i)-'a']==1)

                return s.charAt(i);
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(firstUniqChar(st));

    }
}
