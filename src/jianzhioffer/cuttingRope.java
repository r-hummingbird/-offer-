package jianzhioffer;

public class cuttingRope {
    public static int cuttingRope(int n) {
        if(n < 2) return 0; //绳子长度为1或者0，则返回0；
        // 绳子长度为2或者3的时候，只有一种分法：直接一刀
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n == 4) return 4;
        //贪心：当n>=5时，尽可能多的剪长度为3的绳子；当剩下的绳子长度为4时，剪成两段长度为2的绳子
        int times = n / 3;

        //当剩下的长度可以为4时，不能再剪去长度为3的绳子（因为2*2>3*1）
        if(n - times * 3 == 1)//说明剩下绳子的长度为4，回退一个3
            times -= 1;

        // 此时将绳子剪成长度为2的两段
        int timesOf2 = (n - times * 3) / 2;

        //3^(times) * 2^(timesOf2)
        return (int)Math.pow(3,times) * (int)Math.pow(2,timesOf2);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(cuttingRope(n));
    }
}
