package leecode.Stack;


import java.util.Map;

class MinStack {
    static class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min) {
            this(val, min, null);
        }

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    static Node head;
    public MinStack() {

    }

    public static void push(int val) {
        if (head==null){
            head=new Node(val,val);
        }else {
            head=new Node(val, Math.min(val,head.min),head);
        }
    }

    public static void pop() {
        head=head.next;

    }

    public static int top() {
        return head.val;

    }

    public static int getMin() {
        return head.min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());


    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
