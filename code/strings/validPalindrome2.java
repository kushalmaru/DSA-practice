// https://leetcode.com/problems/valid-palindrome-ii/  680

public class validPalindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        boolean ans = validPalindrome(s);
        System.out.println(ans);
    }

    static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else{
                return isPal(s, i + 1, j) || isPal(s, i, j - 1);
            }
        }
        return true;
    }

    static boolean isPal(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else{
                return false;
            }
        }
        return true;
    }
}
