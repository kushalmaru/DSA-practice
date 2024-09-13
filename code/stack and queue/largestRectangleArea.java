// https://leetcode.com/problems/largest-rectangle-in-histogram/   84

import java.util.Stack;

public class largestRectangleArea {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
    }

    static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;

        for(int i = 0; i <= n; i++){
            int currentHeight = (i == n) ? 0 : heights[i]; // Set height to 0 after finishing the array

            while(!st.isEmpty() && heights[st.peek()] >= currentHeight){
                int particularHeight = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, particularHeight * width);
            }
            st.push(i); 
        }
        return maxArea;
    }
}
