// https://leetcode.com/problems/daily-temperatures/   739


import java.util.Stack;

public class dailyTemperatures {
    public static void main(String[] args) {
        
    }

    static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];

        for(int i = temperatures.length - 1; i >= 0; i--){
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            res[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return res;
    }
}
