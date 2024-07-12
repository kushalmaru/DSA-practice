// https://leetcode.com/problems/check-if-the-sentence-is-pangram/  1832

import java.util.HashSet;

public class panagramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    // static boolean checkIfPangram(String sentence) {
    //     return sentence.chars().distinct().count() == 26;
    // }

    static boolean checkIfPangram(String sentence) {
        HashSet<Character> ch = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            ch.add(sentence.charAt(i));
        }
        return ch.size() == 26;
    }
}
