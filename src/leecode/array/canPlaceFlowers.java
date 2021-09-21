package leecode.array;

public class canPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int len = flowerbed.length;
        while (i < len) {
            boolean b = flowerbed[i] == 0;
            boolean b2 = i == 0 || flowerbed[i-1] == 0;
            boolean b3 = i == len-1 || flowerbed[i+1] == 0;
            if (b && b2 && b3) {
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }
        return n <= 0;

    }

    public static void main(String[] args) {
        int[] flowerbed=new int[]{1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
