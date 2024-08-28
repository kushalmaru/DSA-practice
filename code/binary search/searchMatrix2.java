// https://leetcode.com/problems/search-a-2d-matrix-ii/   240

public class searchMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 5;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] < target){
                row++;
            } else{
                col--;
            }
        }
        return false;
    }
}
