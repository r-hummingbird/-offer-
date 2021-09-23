package leecode.String;

public class repeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        for(int i = 0; i < b.length(); ++i){
            char ch = b.charAt(i);
            if(a.indexOf(ch) == -1){
                return -1;
            }
        }
        int n = a.length(),m = b.length();
//        b中有多少a+2a
        int res = m/n+2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<res;i++){
            sb.append(a);
        }
        String cur = sb.toString();
        int l = cur.indexOf(b);
        if(l!=-1){
            return res - (cur.length()-l-m)/n;
        }
        return -1;
    }

    public static void main(String[] args) {
        String a="abcd";
        String b="cdabcdab";
        System.out.println(repeatedStringMatch(a,b));
    }
}
