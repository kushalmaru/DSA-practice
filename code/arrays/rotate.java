// https://leetcode.com/problems/rotate-image/   48

public class rotate {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        
    }

    static void rotate(int[][] matrix) {
        int m = matrix.length;
        for(int i = 0; i < m; i++){
            for(int j = i + 1; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - 1 - j];
                matrix[i][m - 1 - j] = temp;
            }
        }
    }
}
