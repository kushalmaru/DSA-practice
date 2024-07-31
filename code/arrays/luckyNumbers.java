// https://leetcode.com/problems/lucky-numbers-in-a-matrix/   1380

import java.util.ArrayList;
import java.util.List;

public class luckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxOfRowMin = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int minValue = matrix[i][0];
            for(int j = 0; j < m; j++){
                minValue = Math.min(minValue, matrix[i][j]);
            }
            maxOfRowMin = Math.max(maxOfRowMin, minValue);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int maxValue = matrix[0][i];
            for(int j = 0; j < n; j++){
                maxValue = Math.max(maxValue, matrix[j][i]);
            }
            if(maxValue == maxOfRowMin){
                res.add(maxValue);
            }
        }
        return res;
    }
}
