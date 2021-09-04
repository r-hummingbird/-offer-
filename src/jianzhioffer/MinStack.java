package jianzhioffer;

import javafx.scene.Node;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min; //辅助栈
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }

        public void push(int x) {
            stack.push(x);
            if (min.isEmpty()) {
                min.push(x);
            } else {
                Integer pop = min.pop();
                if (x > pop) {
                    min.push(pop);
                } else {
                    min.push(x);
                }
            }
        }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        Integer pop=stack.pop();
        stack.push(pop);
        return pop;
    }

    public int min() {
        Integer pop=min.pop();
        min.push(pop);
        return pop;
    }

    public static void main(String[] args) {
        MinStack min=new MinStack();
        Random rand=new Random();
        for (int i = 0; i < 5; i++) {
            int data = rand.nextInt(100);
            System.out.print(data + " ");
            min.push(data);
        }
        System.out.println("min"+min.min());
        System.out.println("top"+min.top());

    }
}

