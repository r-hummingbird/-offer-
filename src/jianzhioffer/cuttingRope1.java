package jianzhioffer;

public class cuttingRope1 {
    public static int cuttingRope(int n) {
        if(n < 2) return 0; //绳子长度为1或者0，则返回0；
        // 绳子长度为2或者3的时候，只有一种分法：直接一刀
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n == 4) return 4;
        //贪心：当n>=5时，尽可能多的剪长度为3的绳子；当剩下的绳子长度为4时，剪成两段长度为2的绳子
        long res=1;
        while (n>4){
            res=(res*3)%1000000007;
            n-=3;
        }
        return (int) ((res*n)%1000000007);


    }

    public static void main(String[] args) {
        int n=120;
        System.out.println(cuttingRope(n));
    }
}
