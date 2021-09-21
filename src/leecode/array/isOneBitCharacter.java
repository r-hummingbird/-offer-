package leecode.array;

public class isOneBitCharacter {
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for (; i <bits.length-1 ; i++) {
            if (bits[i]==1)
                i++;
        }
        return i==bits.length-1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1, 1, 1, 0};
        System.out.println(isOneBitCharacter(nums));
    }
}
