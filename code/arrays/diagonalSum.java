// https://leetcode.com/problems/matrix-diagonal-sum/   1572

public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum = sum + mat[i][i] + mat[i][mat.length - 1 - i];
        }
        if(mat.length % 2 == 0){
            return sum;
        } else{
            return sum - mat[mat.length / 2][mat.length / 2];
        }
    }
}
