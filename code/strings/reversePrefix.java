// https://leetcode.com/problems/reverse-prefix-of-word/  2000
public class reversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String ans = reversePrefix(word, ch);
        System.out.println(ans);
    }

    static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j != -1) {
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
        }
        return word;
    }
}
