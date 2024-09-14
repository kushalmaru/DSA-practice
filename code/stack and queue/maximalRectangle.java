// https://leetcode.com/problems/maximal-rectangle/   85

import java.util.Stack;

public class maximalRectangle {
    public static void main(String[] args) {
        
    }

    static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowHeight = new int[col + 1];  // Include an extra element for easier calculation
        int maxArea = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                rowHeight[j] = matrix[i][j] == '1' ? rowHeight[j] + 1 : 0;
            }


            Stack<Integer> st = new Stack<>();
            for(int k = 0; k < rowHeight.length; k++){
                while(!st.isEmpty() && rowHeight[st.peek()] >= rowHeight[k]){
                    int particularHeight = rowHeight[st.pop()];
                    int width = st.isEmpty() ? k : k - st.peek() - 1;
                    maxArea = Math.max(maxArea, particularHeight * width);
                }
                st.push(k);
            }
        }
        return maxArea;
    }
}
