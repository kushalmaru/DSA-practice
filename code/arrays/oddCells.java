// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/   1252

public class oddCells {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1}, {1,1}};
        int ans = oddCells(m, n, indices);
        System.out.println(ans);
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] ind : indices){
            row[ind[0]]++;
            col[ind[1]]++;
        }
        int count =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((row[i]+col[j])%2 != 0)
                    count++;
            }
        }
        return count;
    }
}
