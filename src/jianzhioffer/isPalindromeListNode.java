package jianzhioffer;

import java.util.Stack;

public class isPalindromeListNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean isPalindrome(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        while (head != null) {
            stringBuilder.append(head.val);
            reverse.append(head.val);
            head = head.next;
        }
        reverse.reverse();
        return stringBuilder.toString().equals(reverse.toString());
    }
    public static ListNode arrayToListNode(int[] s){
        ListNode root = new ListNode(s[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int i = 1; i < s.length; i++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(s[i]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,3,2,1};
        ListNode l1=arrayToListNode(nums);
        System.out.println(isPalindrome(l1));

    }
}
