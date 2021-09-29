package leecode.Stack;

import java.util.Stack;

public class removeDuplicates1 {
    public static String removeDuplicates(String s, int k) {
       Stack<int[]> stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (stack.isEmpty()||stack.peek()[0]!=s.charAt(i)-'a'){
                stack.push(new int[]{s.charAt(i)-'a',1});

            }else {
                if (!stack.isEmpty()&&++stack.peek()[1]==k){
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            int[] cur=stack.pop();
            for (int i = 0; i <cur[1] ; i++) {
                sb.append((char)(cur[0] + 'a'));
            }
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String s="deeedbbcccbdaa";
        int k=3;
        System.out.println(removeDuplicates(s,k));
    }
}
