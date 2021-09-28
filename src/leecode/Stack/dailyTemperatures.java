package leecode.Stack;

import java.util.Stack;

public class dailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; ++i){
            while(!stack.isEmpty() &&temperatures[i] > temperatures[stack.peek()]){
                int temp = stack.pop();
                res[temp] = i - temp;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures=new int[]{73,74,75,71,69,72,76,73};
        int[] res=dailyTemperatures(temperatures);
        for (int item:res){
            System.out.print(item);
        }
    }
}
