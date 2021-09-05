package jianzhioffer;

public class reverseList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public static void main(String [] args){
        ListNode in = new ListNode(1);
        in.next= new ListNode(3);
        in.next.next= new ListNode(2);

        ListNode result= reverseList(in);
        while (result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }

}
