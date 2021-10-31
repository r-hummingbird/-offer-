package jianzhioffer;

import java.util.Arrays;

public class checkInclusion {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i = 0;i < s1.length();i++){
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(a,b)){
            return true;
        }
        int left = 0,right = s1.length();
        while(right < s2.length()){
            b[s2.charAt(right) - 'a']++;
            b[s2.charAt(left) - 'a']--;
            if(Arrays.equals(a,b)){
                return true;
            }
            right++;
            left++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="ab";
        String s2="eibaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
