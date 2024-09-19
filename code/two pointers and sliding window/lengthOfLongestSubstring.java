// https://leetcode.com/problems/longest-substring-without-repeating-characters/   3

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxL = 0;
        Map<Character, Integer> mpp = new HashMap<>();
        int left = 0;

        for(int right = 0; right < n; right++){
            if(!mpp.containsKey(s.charAt(right)) || mpp.get(s.charAt(right)) < left){
                mpp.put(s.charAt(right), right);
                maxL = Math.max(maxL, right - left + 1);
            } else{
                left = mpp.get(s.charAt(right)) + 1;
                mpp.put(s.charAt(right), right);
            }
        }
        return maxL;
    }
}
