package jianzhioffer;

public class removeNthFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = new ListNode(0,head),auxh = l;
        for(ListNode r = l; r != null ; r = r.next)
            if(n-- < 0) l = l.next;
        l.next = l.next.next;
        return auxh.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        ListNode res=removeNthFromEnd(l1,2);
        while (res.next!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}
