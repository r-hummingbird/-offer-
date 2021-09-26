package leecode.hash;

import java.util.ArrayList;
import java.util.List;

public class replaceWords {
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] words=sentence.split("\\s+");
        StringBuffer res=new StringBuffer();
        for (int i = 0; i <words.length ; i++) {
            String word=words[i];
            for (String pre:dictionary){
                if (word.startsWith(pre)){
                    word=pre;
                }
            }
            res.append(word).append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        List<String> dictionary=new ArrayList<String>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence="the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sentence));

    }
}
