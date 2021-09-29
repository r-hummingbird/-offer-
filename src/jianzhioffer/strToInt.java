package jianzhioffer;

public class strToInt {
    public static int strToInt(String str) {
        str=str.trim();
        char[] ch=str.toCharArray();
        if (str==null||str.length()==0)
            return 0;
        int flag=1;
        //用于判断正负号，正数（包括前面无符号）1，复数-1；
        int index=1;
        if (ch[0]=='-') flag=-1;
        else if (ch[0]!='+')
            index=0;
        long res=0;
        while (index<ch.length){
            //当遇到不是数字时退出循环，即使是“+”，“-”，“+-2”这样的数也能返回0；
            if(ch[index]<'0'||ch[index]>'9') break;
            res = res*10 +ch[index]-'0';
            if(res>Integer.MAX_VALUE) return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            index++;
        }
        return flag*(int)res;

    }

    public static void main(String[] args) {
        String s="4193 with codes";
        System.out.println(strToInt(s));

    }
}
