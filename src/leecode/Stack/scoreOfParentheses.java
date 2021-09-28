package leecode.Stack;

import java.util.Stack;

public class scoreOfParentheses {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (ch=='('){
                stack.push(res);
                res=0;
            }else {
                res +=stack.peek()+Math.max(res,1);
                stack.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s="(()(()))";
        System.out.println(scoreOfParentheses(s));
    }
}
