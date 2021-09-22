package leecode.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class addToArrayForm {
//    有参考
    //1，不可将A数组遍历得到sumA，与K做加法得到和，原因：A数组的长度可能很长，整数越界；
    //2，我的做法：将K与A倒序的每个元素相加得到和，将和取模得到每个元素，插入到新数组中。
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        int lastNum =k;
        LinkedList<Integer> ret= new LinkedList<>();

        int i = len-1;
        while(i >=0 || lastNum > 0){
            if(i >= 0){
                lastNum+=num[i];
            }
//            头插法保证每次都在最前面
            ret.addFirst(lastNum%10);
            lastNum/=10;
            i--;
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] num=new int[]{1,2,0,0};
        int k=34;
        List<Integer> res=addToArrayForm(num,k);
        System.out.println(res);
    }
}
