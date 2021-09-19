package jianzhioffer;

public class treeToDoublyList {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    static Node pre, head;
    public static Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private static void dfs(Node cur) {
        if(cur == null) return;
        dfs(cur.left);
        // 如果pre为空，就说明是第一个节点，头结点，然后用head保存头结点，用于之后的返回
        if (pre == null) head = cur;
            // 如果不为空，那就说明是中间的节点。并且pre保存的是上一个节点，
            // 让上一个节点的右指针指向当前节点
        else if (pre != null) pre.right = cur;
        // 再让当前节点的左指针指向父节点，也就连成了双向链表
        cur.left = pre;
        // 保存当前节点，用于下层递归创建
        pre = cur;
        dfs(cur.right);
    }

    public static void main(String[] args) {
        Node n1=new Node(4);
        Node n2=new Node(2);
        Node n3=new Node(5);
        Node n4=new Node(1);
        Node n5=new Node(3);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        Node result=treeToDoublyList(n1);
        System.out.println(result.val);





    }
}
