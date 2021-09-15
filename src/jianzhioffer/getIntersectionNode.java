package jianzhioffer;
//不知道哪里错了但是跑不通，累了放弃了

public class getIntersectionNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        while (curA != null) { // 求链表A的长度
            lenA++;
            curA = curA.next;
        }
        while (curB != null) { // 求链表B的长度
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        // 让curA为最长链表的头，lenA为其长度
        if (lenB > lenA) {
            //1. swap (lenA, lenB);
            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;
            //2. swap (curA, curB);
            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;
        }
        // 求长度差
        int gap = lenA - lenB;
        // 让curA和curB在同一起点上（末尾位置对齐）
        int pot=gap;

        while (gap-- > 0) {
            curA = curA.next;
        }
        // 遍历curA 和 curB，遇到相同则直接返回
        while (curA != null) {

            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;

        }

        return null;


    }

    public static void main(String[] args) {
        int[] num={0,9,1,2,4};
        int[] num1={3,2,4} ;
        ListNode l1 = arrayToListNode(num);
        ListNode s1=l1;
        while (s1!=null){
            System.out.print(s1.val+" ");
            s1=s1.next;
        }
        ListNode l2=arrayToListNode(num1);
        while (s1!=null){
            System.out.print(s1.val+" ");
        }
        System.out.println();
        ListNode s2=l2;
        while (s2!=null){
            System.out.print(s2.val+" ");
            s2=s2.next;
        }
        System.out.println();
        ListNode l=getIntersectionNode(l1,l2);
        while (l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }

    }
    private static ListNode arrayToListNode(int[] s) {
        ListNode root = new ListNode(s[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int i = 1; i < s.length; i++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(s[i]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;
    }
}
