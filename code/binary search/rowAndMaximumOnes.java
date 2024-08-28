// https://leetcode.com/problems/row-with-maximum-ones/   2643

import java.util.Arrays;

public class rowAndMaximumOnes {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0}, {0,1,1}};
        int[] ans = rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(ans));
    }

    static int[] rowAndMaximumOnes(int[][] mat) {
        int res[]={0,0};
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0; i<row; i++){
            int count=0;
            for(int j=0; j<col; j++){
                count+=mat[i][j];
            }
            if(count > res[1]) {
                res[0]=i;
                res[1]=count;
            }
        }
        return res;
    }
}
