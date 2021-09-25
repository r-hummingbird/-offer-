package jianzhioffer;
//相同的数异或为0，不同的异或为1。0和任何数异或等于这个数本身。
//有参考
//所以，数组里面所有数异或 = 目标两个数异或 。 由于这两个数不同，所以异或结果必然不为0。
//异或性质如下
//交换律
//结合律（即(a^b)^c == a^(b^c)）
//对于任何数x，都有x^x=0，x^0=x
//自反性 A XOR B XOR B = A xor 0 = A ---> A XOR B = C 则 C XOR B = A
public class singleNumbers {
    public static int[] singleNumbers(int[] nums) {
//        记录异或结果
        int sum=0;
//        得到sum的二进制的1的最低位
        for (int num:nums){
            sum^=num;
        }
        int flag=(-sum)&sum;
//        分成两个组进行异或，每组异或后的结果就是不相同两个数的其中之一
        int result[]=new int[2];
        for(int num:nums) {
            if ((flag & num) == 0)
                result[0] ^= num;
            else {
                result[1] ^= num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,1,4,6};
        int[] res=singleNumbers(nums);
        for (int obj:res){
            System.out.print(obj+" ");
        }
    }
}
