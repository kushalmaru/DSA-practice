// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/   1886

public class findRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1}, {1,0}};
        int[][] target = {{1,0}, {0,1}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++) { // Check four rotations
            if(check(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    static boolean check(int[][] mat, int[][] target) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) { // Corrected to use mat[0].length
                if(mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void rotate(int[][] mat) {
        int n = mat.length;

        // Transpose the matrix
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for(int k = 0; k < n; k++) {
            int start = 0;
            int end = n - 1;
            while(start < end) {
                int temp = mat[k][start];
                mat[k][start] = mat[k][end];
                mat[k][end] = temp;
                start++;
                end--;
            }
        }
    }
}
