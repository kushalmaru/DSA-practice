// https://leetcode.com/problems/remove-k-digits/   402

import java.util.Stack;

public class removeKdigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        String ans = removeKdigits(num, k);
        System.out.println(ans);
    }

    static String removeKdigits(String num, int k) {
        int n = num.length();
        if(k == n){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
