package jianzhioffer;

import java.util.Collections;
import java.util.List;

public class sortList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode sortList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;
        while (fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        return merge(l1,l2);
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode p=new ListNode(),l=p;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
            }else {
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if (l1!=null)
            p.next=l1;
        if (l2!=null){
            p.next=l2;
        }
        return l.next;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(4);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(1);
        ListNode n4=new ListNode(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        ListNode res=sortList(n1);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}
