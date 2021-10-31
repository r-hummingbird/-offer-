package leecode.doublePoint;

public class characterReplacement {
    public static int characterReplacement(String s, int k) {
        int len=s.length();
        if (len<2)
            return len;
        char[] ch=s.toCharArray();
        int l=0,r=0;
        int maxCount=0;
        int[] fre=new int[26];
        while (r<len){
            fre[ch[r]-'A']++;
            maxCount=Math.max(maxCount,fre[ch[r]-'A']);

            if (r-l+1>maxCount+k){
                //则k不够用
                fre[ch[l]-'A']--;
                l++;
            }
            r++;
        }
        return r-l;
    }

    public static void main(String[] args) {
        String s="ABAB";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }
}
