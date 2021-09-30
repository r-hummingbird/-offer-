package leecode.BinarySearch;

public class divide {
    public static int divide(int dividend, int divisor) {
        if (dividend==0){
            return 0;
        }
        if (dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean negative=(dividend^divisor)<0;//异或判断符号是不是负
        long t = Math.abs((long) dividend);
        long d= Math.abs((long) divisor);
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
        int dividend=10;
        int divisor=3;
        System.out.println(divide(dividend,divisor));
    }
}
