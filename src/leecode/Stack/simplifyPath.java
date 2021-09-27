package leecode.Stack;

import java.util.Stack;

public class simplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] str=path.split("/");
        for (String item:str){
            if (item.isEmpty()||item.equals("."))
                continue;
            if (item.equals("..")){
                if (!stack.empty())
                    stack.pop();
            }else {
                stack.push(item);
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        String path="/home//foo/";
        System.out.println(simplifyPath(path));

    }
}
