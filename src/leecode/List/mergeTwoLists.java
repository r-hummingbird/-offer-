package leecode.List;

public class mergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(4);
        ListNode l2=new ListNode(1);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(4);
        l1.next=l3;
        l3.next=l4;
        l2.next=l5;
        l5.next=l6;
        ListNode res=mergeTwoLists(l1,l2);
        while (res!=null){
            System.out.print(res.val);
            res=res.next;
        }

    }
}
