package jianzhioffer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        String st;
        Scanner sc=new Scanner(System.in);
        st=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(st));
    }

}
