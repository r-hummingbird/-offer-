package jianzhioffer;

import java.util.Stack;

public class evalRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int op1=0,op2=0;
        for (String token:tokens){
            switch(token) {
                case "+": {
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op1 + op2);
                    break;
                }
                case "-": {
                    // care the order here
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 - op2);
                    break;
                }
                case "*": {
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op1 * op2);
                    break;
                }
                case "/": {
                    // care the order here
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 / op2);
                    break;
                }
                default: {
                    stack.push(Integer.valueOf(token));
                    break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
