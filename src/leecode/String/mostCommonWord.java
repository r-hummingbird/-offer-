package leecode.String;

import java.util.HashMap;
import java.util.Map;

public class mostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replace(",", " ").replace(".", " ").replace("!", " ").replace("?", " ").replace(";", " ").replace("'", " ");
        for (int i = 0; i < banned.length; i++)
            paragraph = paragraph.replace(banned[i], "");
        paragraph = paragraph.replaceAll("\\s+", " ").trim().toLowerCase();
        String[] arr = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            if (map.get(arr[i]) != null)
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        int count = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue() > count) {
                count = entry.getValue();
                result = entry.getKey();
            }
        return result;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned=new String[]{"hit"};
        String result=mostCommonWord(paragraph,banned);
        System.out.println(result);
    }
}
