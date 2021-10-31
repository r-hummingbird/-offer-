package jianzhioffer;

public class MagicDictionary {
    static String[] dictionary;
    public MagicDictionary() {

    }

    public void buildDict(String[] dictionary) {
        this.dictionary=dictionary;
    }

    public static boolean search(String searchWord) {
        for (String st:dictionary){
            int diffrent=0;
            if (st.length()!=searchWord.length())
                continue;
            for (int i = 0; i <searchWord.length() ; i++) {
                if (st.charAt(i)!=searchWord.charAt(i)) {
                    diffrent++;
                    if (diffrent>1)
                        break;
                }
            }
            if (diffrent==1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MagicDictionary obj = new MagicDictionary();
        String[] dictionary=new String[]{"hello", "leetcode","judge"};
        obj.buildDict(dictionary);
        boolean param_2 = obj.search("juage");
        System.out.println(param_2);
    }
}
