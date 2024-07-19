// https://leetcode.com/problems/valid-palindrome-ii/  680

public class validPalindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        boolean ans = validPalindrome(s);
        System.out.println(ans);
    }

    static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return isRestOfStringValid(s, left + 1, right) || isRestOfStringValid(s, left, right - 1);
            left++;
            right--;
        }
        return true;
    }
    static boolean isRestOfStringValid(String s, int left, int right) {
        String str = s.substring(left, right + 1);
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
