// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/   1967


public class stringsAppearAsSubstrings {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int ans = numOfStrings(patterns, word);
        System.out.println(ans);
    }

    // static int numOfStrings(String[] patterns, String word) {
    //     int count = 0;
    //     for(int i = 0; i < patterns.length; i++){
    //         if(word.contains(patterns[i])){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            String w = patterns[i];
            if(word.indexOf(w) != -1){
                count++;
            }
        }
        return count;
    }
}
