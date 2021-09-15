package jianzhioffer;

public class mergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

            int[] num={1,2,4};
            int[] num1={1,3,4} ;
            ListNode l1 = arrayToListNode(num);
            ListNode l2=arrayToListNode(num1);
            ListNode l3=mergeTwoLists(l1,l2);
            System.out.println(" ");
            while (l3!=null){
                System.out.print(l3.val+" ");
                l3=l3.next;
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
