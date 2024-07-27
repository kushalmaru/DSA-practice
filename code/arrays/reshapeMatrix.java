// https://leetcode.com/problems/reshape-the-matrix/  566

import java.util.ArrayList;
import java.util.Arrays;

public class reshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2}, {3,4}};
        int r = 2;
        int c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c){
            return mat;
        }
        if(r == m && c == n){
            return mat;
        }

        int[][] ans = new int[r][c];
        for(int i = 0; i < r * c; i++){
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }
}
