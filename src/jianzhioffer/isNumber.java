package jianzhioffer;

public class isNumber {
    public static boolean isNumber(String s) {
        if (s==null||s.length()==0)return false;
        char[] ch=s.trim().toCharArray();
        boolean numFlag = false;
        boolean dotFlag = false;
        boolean eFlag = false;
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]>='0'&&ch[i]<='9'){
                numFlag=true;
            }else if (ch[i]=='.'&&!dotFlag&&!eFlag){
                dotFlag=true;
            }else if ((ch[i]=='e'||ch[i]=='E')&&!dotFlag&&!eFlag&&numFlag) {
                eFlag = true;
                numFlag = false;//为了避免123e这种请求，出现e之后就标志为false
                //判定为+-符号，只能出现在第一位或者紧接e后面
            } else if ((ch[i] == '+' || ch[i] == '-') && (i == 0 || ch[i-1] == 'e' || ch[i-1] == 'E')){
                numFlag=false;
            }else {
                return false;
            }
        }
        return numFlag;
    }

    public static void main(String[] args) {
        String s="e9";
        System.out.println(isNumber(s));
    }
}
