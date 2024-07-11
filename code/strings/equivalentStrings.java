// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/   1662

public class equivalentStrings {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
    // public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     String ans1 = null;
    //     String ans2 = null;
    //     for(int i = 0; i < word1.length; i++){
    //         ans1 = ans1 + word1[i];
    //     }
    //     for(int j = 0; j < word2.length; j++){
    //         ans2 = ans2 + word2[j];
    //     }
    //     return ans1.equals(ans2);
    // }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1 = String.join("",word1);
        String ans2 = String.join("",word2);
        return ans1.equals(ans2);
    }
}
