package jianzhioffer;

public class reorderList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void reorderList(ListNode head) {
        ListNode temp = head;
        int node_count = 0;
        while(temp!=null){
            temp = temp.next;
            node_count++;
        }
        int half = node_count%2==0?node_count/2:(node_count+1)/2;
        temp = head;
        ListNode secondHead=temp;
        while(half>=0){
            if(half == 0){
                secondHead = temp;
                break;
            }else if(half == 1){
                ListNode tempnext = temp.next;
                temp.next =null;
                temp = tempnext;
            }else{
                temp = temp.next;
            }
            half--;
        }
        //reverse the second half of linked list
        ListNode cur = secondHead;
        ListNode pre = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        //merge two linked lists
        ListNode node1 = head;
        ListNode node2 = pre;
        while(node1!=null&&node2!=null){
            ListNode temp1 = node1.next;
            ListNode temp2 = node2.next;
            node1.next = node2;
            node2.next = temp1;
            node1 = temp1;
            node2 = temp2;
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

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6};
        ListNode l1=arrayToListNode(nums);
        reorderList(l1);
        while (l1!=null){
            System.out.print(l1.val);
            l1=l1.next;
        }
    }
}
