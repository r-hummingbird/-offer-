package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

public class copyRandomList {
    static class Node {
        int val;
        Node next;
        Node random;
        public Node(){
            this.next = null;
            this.random = null;
        }
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node p = head; // p遍历链表
        Map<Node,Node> map = new HashMap<>();
        // 复制各节点,建立 原节点->新节点的映射(原新节点值相同)
        while(p != null){
            map.put(p,new Node(p.val));
            p = p.next;
        }
        p = head;
        // 再次遍历列表,构建next和random指向
        while(p != null){
            // value.next   =    key.next
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);

            p = p.next;
        }
        // 打印新链表的头结点

        return map.get(head); //就是获取head对应的value

    }

    public static void main(String[] args) {
        Node head = new Node(1);

        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        head.next = n1;
        head.random = n2;
        n1.next = n2;
        n1.random=n3;
        n2.next = n3;
        n2.random=n1;
        n3.random=n4;
        n3.next = n4;
        n4.random = n1;

        Node copyhead = new Node();
        copyRandomList n = new copyRandomList();
        copyhead = n.copyRandomList(head);
        while(copyhead != null) {
            System.out.print("["+copyhead.val+" "+copyhead.random.val+"]");
            copyhead = copyhead.next;
        }

    }
}
