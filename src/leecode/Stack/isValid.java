package leecode.Stack;

import java.util.Stack;

public class isValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch=='b') stack.push(ch);
            if(ch == 'c'){
                if(stack.size() < 2) return false;
                if(stack.pop()!='b') return false;
                if(stack.pop()!='a') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="aabcbc";
        System.out.println(isValid(s));
    }
}
