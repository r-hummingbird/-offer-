package leecode.Stack;

import java.util.Stack;

public class reverseParentheses {
    public static String reverseParentheses(String s) {
        StringBuffer sb=new StringBuffer();
        char[] ch=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]=='('){
                stack.push(i);
            }
            if (ch[i]==')'){
                reverse(ch,stack.pop()+1,i-1);
            }
        }
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]!=')'&&ch[i]!='(') {
                sb.append(ch[i]);
            }

        }
        return sb.toString();
    }
    public static void reverse(char[] arr, int left, int right) {
        while (right>left){
            char temp=arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }

    }


    public static void main(String[] args) {
        String s= "(abcd)";
        System.out.println(reverseParentheses(s));
    }
}
