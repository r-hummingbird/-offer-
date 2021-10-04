package jianzhioffer;

public class divide {
    public static int divide(int a, int b) {
        if (a==0){
            return 0;
        }
        if (a==Integer.MIN_VALUE&&b==-1){
            return Integer.MAX_VALUE;
        }
        boolean negative=(a^b)<0;//异或判断符号是不是负
        long t = Math.abs((long) a);
        long d= Math.abs((long) b);
        int result = 0;
        for (int i = 31; i >=0 ; i--) {
            if ((t>>i)>=d){
                result+=1<<i;
                t-=d<<i;

            }
        }
        return negative ? -result : result;//符号相异取反
    }

    public static void main(String[] args) {
        int a=15,b=2;
        System.out.println(divide(a,b));
    }
}
