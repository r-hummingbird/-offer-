package jianzhioffer;

public class validPalindrome {
    public static boolean validPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return valid(s,l + 1,r) || valid(s,l,r - 1);
            }
        }
        return true;
    }

    private static boolean valid(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="abca";
        System.out.println(validPalindrome(s));
    }
}
