package jianzhioffer;

import java.util.LinkedList;
import java.util.Random;
import java.util.RandomAccess;

class CQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue() {
        stack1=new LinkedList<Integer>();
        stack2=new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            if (stack1.isEmpty()) return -1;
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
            return stack2.pop();
        }
        else
            return stack2.pop();
    }
    public static void main(String[] args) {
        Random rand=new Random();
        CQueue cq = new CQueue();
        for (int i = 0; i < 5; i++) {
            int data = rand.nextInt(100);
            System.out.print(data + " ");
            cq.appendTail(data);
        }
        int pop = cq.deleteHead();
        System.out.print(pop);


    }

}

