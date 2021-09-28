package leecode.Stack;

import java.util.Stack;

public class minAddToMakeValid {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for (int i = 0; i <n ; i++) {
            char ch=s.charAt(i);
            if (stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if (stack.peek()=='('&&ch==')'){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String s="()))((";
        System.out.println(minAddToMakeValid(s));
    }
}
