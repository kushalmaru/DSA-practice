// https://leetcode.com/problems/shuffle-string/  1528

import java.lang.*;
public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        restoreString(s, indices);
    }

    static String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < indices.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }
}
