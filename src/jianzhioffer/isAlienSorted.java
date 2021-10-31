package jianzhioffer;

import javafx.scene.effect.InnerShadow;

import java.util.HashMap;
import java.util.Map;

public class isAlienSorted {
    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map=new HashMap<>();
        for (int i = 0; i <order.length() ; i++) {
            map.put(order.charAt(i),i);
        }
        for (int i = 0; i <words.length-1 ; i++) {
            String w1 = words[i];
            int w1_len = w1.length();
            String w2 = words[i + 1];
            int w2_len = w2.length();
            for (int j = 0; j < Math.max(w1_len, w2_len); j++) {
                int idx_w1 = j >= w1_len ? -1 : map.get(w1.charAt(j));
                int idx_w2 = j >= w2_len ? -1 : map.get(w2.charAt(j));
                if (idx_w1 > idx_w2) return false;
                if (idx_w1 < idx_w2) break;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String[] words={"hello","leetcode"};
        String order="hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words,order));
    }
}
