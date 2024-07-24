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
        if (r * c != mat.length * mat[0].length){
            return mat;
        }
        int ans[][] = new int[r][c];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int[] i: mat){
            for (int j: i){
                arr.add(j);
            }
        }
        int a = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                ans[i][j] = arr.get(a);
                a++;
            }
        }
        return ans;
    }
}
