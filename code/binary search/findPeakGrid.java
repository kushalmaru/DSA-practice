// https://leetcode.com/problems/find-a-peak-element-ii/   1901

import java.util.Arrays;

public class findPeakGrid {
    public static void main(String[] args) {
        int[][] mat = {{0,20,15}, {21,30,14}, {7,16,32}};
        int[] ans = findPeakGrid(mat);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int maxRowIndex = maxIndex(mat, m, n, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < n ? mat[maxRowIndex][mid + 1] : -1;
            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right){
                return new int[]{maxRowIndex, mid};
            } else if(mat[maxRowIndex][mid] < left){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int maxIndex(int[][] mat, int m, int n, int mid){
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < m; i++){
            if(mat[i][mid] > maxValue){
                maxValue = mat[i][mid];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
