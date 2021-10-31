package jianzhioffer;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {

            while (left < right && !Character.isDigit(chars[left]) && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isDigit(chars[right]) && !Character.isLetter(chars[right])) {
                right--;
            }

            if (chars[left] != chars[right]) {
                return false;
            }

        }

        return true;
    }



    public static void main(String[] args) {
        String s="0P";
        System.out.println(isPalindrome(s));
    }
}
