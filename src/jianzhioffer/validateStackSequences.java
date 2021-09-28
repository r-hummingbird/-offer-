package jianzhioffer;

import java.util.Stack;

public class validateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for (int item:pushed){
            stack.push(item);
            while (j<popped.length&&!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
                
            }
        }
        return j==popped.length;
    }

    public static void main(String[] args) {
        int[] pushed=new int[]{1,2,3,4,5};
        int[] poped=new int[]{4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,poped));
    }
}
