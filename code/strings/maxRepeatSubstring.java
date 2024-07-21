// https://leetcode.com/problems/maximum-repeating-substring/   1668

public class maxRepeatSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        int ans = maxRepeating(sequence, word);
        System.out.println(ans);
    }

    static int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        sb.append(word);
        while(sequence.contains(sb)){
            count++;
            sb.append(word);
        }
        return count;
    }
}
