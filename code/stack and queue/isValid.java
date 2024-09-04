// https://leetcode.com/problems/valid-parentheses/   20

import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        
    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '[' || currentChar == '{' || currentChar == '('){
                st.push(currentChar);
            } else if(st.empty()){
                return false;
            } else {
                char ch = st.pop();
                if((currentChar == ']' && ch != '[') || (currentChar == '}' && ch != '{') || (currentChar == ')' && ch != '(')){
                    return false;
                }
            }
        }
        return st.empty();
    }
}
