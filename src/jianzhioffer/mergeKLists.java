package jianzhioffer;

import org.w3c.dom.ls.LSInput;

public class mergeKLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if (n==0)
            return null;
        if (n==1)
            return lists[0];
        for (int i = 0; i <n-1; i++) {
            lists[i+1]=mergeTwoLists(lists[i],lists[i+1]);
        }
        return lists[n-1];
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }



    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        ListNode l4=new ListNode(1);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(4);
        l4.next=l5;
        l5.next=l6;
        ListNode l7=new ListNode(2);
        ListNode l8=new ListNode(6);
        l7.next=l8;
        ListNode[] lists=new ListNode[]{l1,l4,l7};
        ListNode res=mergeKLists(lists);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}
