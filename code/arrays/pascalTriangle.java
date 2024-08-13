// https://leetcode.com/problems/pascals-triangle/   118

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    static List<List<Integer>> generate(int numRows) {      
        List<List<Integer>> res = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            res.add(generateRow(row));
        }
        return res;
    }

    static List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}
