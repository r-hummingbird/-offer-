package jianzhioffer;

import java.util.Random;

public class reversePrint {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String [] args){
        ListNode in = new ListNode(1);
        in.next= new ListNode(3);
        in.next.next= new ListNode(2);

        int[] result=reversePrint(in);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");

        }
    }

    //数组倒序输入    时间复杂度O(n) 空间复杂度O(n)
    public static int[] reversePrint(ListNode head) {
        //先获取链表长度，创建对应长度数组
        ListNode currNode = head;
        int len = 0;
        while(currNode != null){
            len ++;
            currNode = currNode.next;
        }
        int[] result = new int[len];

        //再次遍历链表，将值倒序填充至结果数组
        currNode = head;
        while(currNode != null){
            result[len - 1] = currNode.val;
            len --;
            currNode = currNode.next;
        }
        return result;
    }


}
