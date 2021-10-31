package jianzhioffer;

public class flatten {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public static Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private static Node dfs(Node head) {
        Node cur = head;
        Node last = null;
        System.out.print(head.val+" ");
        while (cur != null) {
            Node next = cur.next;

            // 如果有子节点，先遍历子节点
            if (cur.child != null) {
                Node childLast = dfs(cur.child);

                next = cur.next;
                // 将 node 与 child 相连
                cur.next = cur.child;
                cur.child.prev = cur;

                // 如果 next 不为空，就将 last 与 next 相连
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }

                // 将child置空
                cur.child = null;
                last = childLast;
            } else {
                last = cur;
            }
            cur = next;
        }
        return last;
    }

    public static void main(String[] args) {
        Node head=new Node();
        Node l3=new Node();
        Node l2=new Node();
        head.val=1;
        l3.val=3;
        l2.val=2;
        l3=head.child;
        l2.prev=head;
        l2=head.next;
        Node res=flatten(head);

    }
}
