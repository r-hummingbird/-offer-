package leecode.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class nextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {

        int length = letters.length;
        int low = 0, high = length - 1;
        // 开始二分查找
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low < length ? letters[low] : letters[0];
    }

    public static void main(String[] args) {
        char[] letters=new char[]{'z', 'a', 'b'};
        char target='c';
        System.out.println(nextGreatestLetter(letters,target));
    }
}
