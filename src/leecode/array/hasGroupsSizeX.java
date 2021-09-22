package leecode.array;



public class hasGroupsSizeX {
    public static boolean hasGroupsSizeX(int[] deck) {
        int[] counter = new int[10000];
        for (int num: deck) {
            counter[num]++;
        }
        int x = 0;
        for(int cnt: counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >1;
    }
    //辗转相除法求最大公约数，这样就可以看出来可不可以有相同的长度
    private static int gcd(int x, int cnt) {
        return cnt==0?x:gcd(cnt,x%cnt);
    }


    public static void main(String[] args) {
        int[] deck=new int[]{1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(deck));
    }
}
