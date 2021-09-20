package leecode.array;

public class canPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = 0,count = 1;  //假设在数组左边添加0，以解决边界问题，令count初始为1
        for (int i=0;i<flowerbed.length;i++){
            if (flowerbed[i] == 0){
                count++;
            }else{
                count = 0;
            }
            if (count == 3){    //每连续三个0种一次花
                num++;
                count = 1;
            }
        }
        if (count == 2){    //如果最后count为2而不是1，表示最后一个位置可以种花
            num++;
        }
        return n <= num;

    }

    public static void main(String[] args) {
        int[] flowerbed=new int[]{1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
