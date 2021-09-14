package jianzhioffer;

public class getKthFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        while(fast!=null) {
            fast = fast.next;
            if(k==0) {
//                慢指针同步上块指针
                head = head.next;
            }else {
                k--;
            }
        }
        return head;



    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        ListNode l1 = arrayToListNode(num);
//        while (l1!=null){
//            System.out.print(l1.val+" ");
//            l1=l1.next;
//        }
        ListNode l2= getKthFromEnd(l1,2);
        System.out.println(" ");
        while (l2!=null){
            System.out.print(l2.val+" ");
            l2=l2.next;
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
