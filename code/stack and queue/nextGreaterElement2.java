// https://leetcode.com/problems/next-greater-element-ii/   503

import java.util.Stack;

public class nextGreaterElement2 {
    public static void main(String[] args) {
        
    }

    static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2 * n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i % n]){
                st.pop();
            }
            if(i < n){
                res[i] = st.isEmpty() ? -1 :  st.peek();
            }
            st.push(nums[i % n]);
        }
        return res;
    }
}
