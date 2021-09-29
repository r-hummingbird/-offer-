package leecode.BinarySearch;

public class arrangeCoins {
    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2.0 * n + 0.25) - 0.5);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
}
