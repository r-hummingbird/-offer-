package leecode.hash;

import java.util.HashMap;

public class firstUniqChar {
    public static int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1;
        int[] c = new int[26];
        for(int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(c[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));
    }
}
