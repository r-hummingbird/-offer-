package jianzhioffer;
//0 ^ x = x,
//
//x ^ x = 0；
//
//x & ~x = 0,
//
//x & ~0 =x;
//x第一次出现后，a = (a ^ x) & ~b的结果为 a = x, b = (b ^ x) & ~a的结果为此时因为a = x了，所以b = 0。
//
//x第二次出现：a = (a ^ x) & ~b, a = (x ^ x) & ~0, a = 0; b = (b ^ x) & ~a 化简， b = (0 ^ x) & ~0 ,b = x;
//
//x第三次出现：a = (a ^ x) & ~b， a = (0 ^ x) & ~x ,a = 0; b = (b ^ x) & ~a 化简， b = (x ^ x) & ~0 , b = 0; 所以出现三次同一个数，a和b最终都变回了0.
//
//只出现一次的数，按照上面x第一次出现的规律可知a = x, b = 0;因此最后返回a.
public class singleNumber {
    public static int singleNumber(int[] nums) {
        int a = 0;
        int b = 0;

        for(int num : nums) {
            a = (a ^ num) & ~b;
            b = (b ^ num) & ~a;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,4,3,3};
        System.out.println(singleNumber(nums));
    }
}
