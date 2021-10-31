package jianzhioffer;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import java.nio.file.FileAlreadyExistsException;

public class detectCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&slow.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if (slow==fast){
                fast=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        ListNode l1=new ListNode(3);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(0);
//        ListNode l4=new ListNode(-4);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l2;
        ListNode l1=new ListNode();
        ListNode res=detectCycle(l1);
        int index=0;
        while (l1.next!=null){
            if (l1.val==res.val){
                System.out.println(index);
                break;
            }else {
                l1=l1.next;
                index++;
            }
        }
    }
}
