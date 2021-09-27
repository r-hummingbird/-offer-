package leecode.Stack;

import java.util.IllegalFormatCodePointException;
import java.util.Stack;

public class backspaceCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        char[] sArr = s.toCharArray(), tArr = t.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == '#') {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            } else {
                stackS.push(sArr[i]);
            }
        }
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == '#') {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            } else {
                stackT.push(tArr[i]);
            }
        }
        while (!stackS.isEmpty() && !stackT.isEmpty()) {
            if (stackS.peek() != stackT.peek()) return false;
            stackS.pop();
            stackT.pop();
        }
        return stackS.isEmpty() && stackT.isEmpty();
    }

    public static void main(String[] args) {
        String s="ab##";
        String t="c#d#";
        System.out.println(backspaceCompare(s,t));
    }
}
