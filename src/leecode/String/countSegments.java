package leecode.String;

public class countSegments {
    public static int countSegments(String s) {
        String []s1 = s.split(" ");
        int res =0;
        for(String s2 : s1){
            if(s2.length()>0)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s="Hello, my name is John";
        System.out.println(countSegments(s));
    }
}
