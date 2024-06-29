// https://leetcode.com/problems/valid-palindrome/   125
import java.util.*;
import java.lang.String;

public class validPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
    
        while(left < right) {
            // Skip non-alphanumeric characters
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
    
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


