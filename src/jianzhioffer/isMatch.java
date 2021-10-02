package jianzhioffer;

public class isMatch {
    public static boolean isMatch(String s, String p) {
        char[] ch=s.toCharArray();
        char[] ch1=p.toCharArray();
        return isMatch1(ch,0,ch1,0);
    }

    private static boolean isMatch1(char[] ch, int i, char[] ch1, int i1) {
        if (i==ch.length&&i1==ch1.length){
            return true;
        }
        if (i!=ch.length&&i1==ch1.length){
            return false;
        }
        boolean matchCur=i< ch.length&&(ch1[i1]==ch[i]||ch1[i1]=='.');
        if (ch1.length-i1>=2&&ch1[i1+1]=='*'){
            return isMatch1(ch,i,ch1,i1+2)||(matchCur&&isMatch1(ch,i+1,ch1,i1));
        }
        return matchCur&&isMatch1(ch,i+1,ch1,i1+1);
    }

    public static void main(String[] args) {
        String s="aa";
        String p="a";
        System.out.println(isMatch(s,p));
    }
}
