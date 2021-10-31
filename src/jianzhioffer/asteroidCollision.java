package jianzhioffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class asteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <asteroids.length ; i++) {
            if (asteroids[i]>=0){
                stack.add(asteroids[i]);
            }else {
                while (!stack.isEmpty() && stack.peek() >= 0 && Math.abs(asteroids[i]) > stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.add(asteroids[i]);
                }else {
                    if (stack.peek()>=0){
                        if (stack.peek()==Math.abs(asteroids[i])){
                            stack.pop();
                        }
                    }else {
                        stack.add(asteroids[i]);
                    }
                }
            }
        }
        int[] res=new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] asteroids=new int[]{5,10,-5};
        int[] res=asteroidCollision(asteroids);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
}
