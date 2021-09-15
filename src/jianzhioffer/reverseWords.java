package jianzhioffer;

public class reverseWords {
    public static String reverseWords(String s) {
        String str = s.trim();
        String[] string=s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=string.length-1;i>=0;i--){
            if(string[i].equals(" ")||string[i].equals("")){
                continue;
            }

            sb.append(string[i]);
            sb.append(" ");

        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s="hello world!";
        String result=reverseWords(s);
        System.out.println(result);
    }
}
