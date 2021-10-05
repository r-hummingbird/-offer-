package jianzhioffer;

import java.util.Spliterator;

public class maxProduct {
    public static int maxProduct(String[] words) {
        int count=0;
        for (int i = 0; i <words.length-1 ; i++) {
            for (int j = i+1; j <words.length ; j++) {
                count=Math.max(count,Product(words[i],words[j]));
            }
        }
        return count;
    }

    private static int Product(String a, String b) {
        int[] a1=new int[26];
        int[] b1=new int[26];
        int len1=a.length(),len2=b.length();
        for (int i = 0; i < len1; i++) {
            a1[a.charAt(i)-'a']++;
        }
        for (int i = 0; i < len2; i++) {
            b1[b.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(a1[i]!=0&&b1[i]!=0) return 0;
        }
        return len1*len2;
    }

    public static void main(String[] args) {
        String[] words=new String[]{"abcw","baz","foo","bar","fxyz","abcdef"};
        System.out.println(maxProduct(words));
    }
}
