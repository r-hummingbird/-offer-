package jianzhioffer;

public class insert {
    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };
    public static Node insert(Node head, int insertVal) {
        Node newNode = new Node(insertVal);
        if(head == null){ //边界1：空链表
            head = newNode;
            head.next = head;
            return head;
        }

        if(head.next == head){ //边界2：只有一个节点
            newNode.next = head;
            head.next = newNode;
            return head;
        }

        //插入情况1：在循环链表中同时找到比待插入值小的元素节点和比待插入值大的元素节点，则将其插入到两个节点中间
        //插入情况2：没有同时满足比其小和比其大的元素，则插在最大值和最小值中间
        Node cur = head;
        Node next = cur.next;
        Node biggest = cur; //链表最大值
        while(!(cur.val <= newNode.val && newNode.val <= next.val) && (next != head)){
            //if(cur.val >= biggest.val)
            //biggest = cur;
            cur = cur.next;
            next = next.next;
            if(cur.val >= biggest.val) //为了防止next==head时，没有用新的cur.val与biggest.val比较
                biggest = cur;
        }
        if(cur.val <= newNode.val && newNode.val <= next.val){ //cur.val < = insertVal && next.val >= insertVal
            newNode.next = cur.next;
            cur.next = newNode;
        } else {
            //System.out.println("big = " + biggest.val);
            newNode.next = biggest.next;
            biggest.next = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(4);
        Node n3=new Node(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;
        int inserVal=2;
        Node res=insert(n1,inserVal);
        Node head=n1;
        while (res!=head){
            System.out.print(res.val);
            res=res.next;
        }
    }
}
