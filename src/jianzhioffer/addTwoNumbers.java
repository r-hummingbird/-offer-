package jianzhioffer;

public class addTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reverseL1 = reverseList(l1);
        ListNode reverseL2 = reverseList(l2);
        ListNode res = new ListNode();
        ListNode cur = res;
        int temp = 0;
        while (reverseL1 != null || reverseL2 != null) {
            int num1 = reverseL1 == null ? 0 : reverseL1.val;
            int num2 = reverseL2 == null ? 0 : reverseL2.val;
            int sum = num1 + num2 + temp;
            int d = sum % 10;
            temp = sum / 10;
            cur.next = new ListNode(d);
            cur = cur.next;
            if (reverseL1 != null) {
                reverseL1 = reverseL1.next;
            }
            if (reverseL2 != null) {
                reverseL2 = reverseL2.next;
            }
        }
        if (temp == 1) {
            cur.next = new ListNode(1);
        }
        return reverseList(res.next);

    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;

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
    public static void main(String[] args) {
        int[] nums=new int[]{7,2,4,3};
        int[] nums1=new int[]{5,6,4};
        ListNode l1=arrayToListNode(nums);
        ListNode l2=arrayToListNode(nums1);
        ListNode res=addTwoNumbers(l1,l2);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }

    }
}
