// https://leetcode.com/problems/length-of-last-word/   58

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
    static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }else{
                length++;
            }
        }
        return length;
    }
}
