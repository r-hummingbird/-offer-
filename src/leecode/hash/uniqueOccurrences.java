package leecode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int elem : arr)
            counter.put(elem, counter.getOrDefault(elem, 0) + 1);

        return counter.size() == new HashSet<Integer>(counter.values()).size();
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2};
        System.out.println(uniqueOccurrences(arr));
    }
}
