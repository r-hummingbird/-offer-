package leecode.Stack;

public class removeDuplicates {
    public static String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        int len=0;
        for (char ch:s.toCharArray()){
            if (len>0&&sb.charAt(len-1)==ch){
                sb.deleteCharAt(len-1);
                len--;
            }else {
                sb.append(ch);
                len++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
}
