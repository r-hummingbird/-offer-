package leecode.Greedy;

public class balancedStringSplit {
    public static int balancedStringSplit(String s) {
        int num=0;
        int n=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='R')
                n++;
            if (s.charAt(i)=='L')
                n--;
            if (n==0)
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
