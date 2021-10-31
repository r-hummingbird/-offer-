package jianzhioffer;

import java.util.HashMap;

public class minWindow {
    public static String minWindow(String s, String t) {
        int cnt = 0;
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();
        int n = s.length(), m = t.length();
        for (int i = 0; i < m; i ++){
            char c = t.charAt(i);
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }
        String res = "";
        int total = tmap.size();
        for (int i = 0, j = 0; j < n; j ++){
            char c = s.charAt(j);
            // 直接把字符放入smap中
            smap.put(c, smap.getOrDefault(c, 0) + 1);
            if (tmap.containsKey(c) && smap.get(c) <= tmap.get(c)) cnt++;
            // 如果i指针的字符冗余
            char ic = ' ';
            while (i <= j && smap.get(ic = s.charAt(i)) > tmap.getOrDefault(ic, 0)) {
                smap.put(ic , smap.get(ic) - 1);
                // 当减去tmap中的字符, 代表有smap一种字符不完全和tmap匹配了
                if (tmap.containsKey(ic) && tmap.get(ic) > smap.get(ic)) cnt--;
                i++;
            }
            if (cnt == m) res = res.length() > j - i + 1 || res == "" ? s.substring(i, j + 1) : res;

        }
        return res;
    }

    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }
}
