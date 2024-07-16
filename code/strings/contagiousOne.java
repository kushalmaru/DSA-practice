// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/   1784

public class contagiousOne {
    public static void main(String[] args) {
        String s = "1001";
        boolean ans = checkOnesSegment(s);
        System.out.println(ans);
    }

    // static boolean checkOnesSegment(String s) {
    //     for(int i = 1; i < s.length(); i++){
    //         if(s.charAt(i) == '1' && s.charAt(i - 1) == '1'){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
