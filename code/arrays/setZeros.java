// https://leetcode.com/problems/set-matrix-zeroes/   73
public class setZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        
    }

    // Brute force with extra memory

    // static void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     int[] rowsArray = new int[m];
    //     int[] colsArray = new int[n];

    //     Arrays.fill(rowsArray, 1);
    //     Arrays.fill(colsArray, 1);

    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(matrix[i][j] == 0){
    //                 rowsArray[i] = 0;
    //                 colsArray[j] = 0;
    //             }
    //         }
    //     }

    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(rowsArray[i] == 0 || colsArray[j] == 0){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    // Optimized
    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow = false; 
        boolean isCol = false;

        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                isRow = true;
            }
        }

        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                isCol = true;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        } 

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isRow == true){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        } 

        if(isCol == true){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
