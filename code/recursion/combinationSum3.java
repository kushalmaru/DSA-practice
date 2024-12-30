// https://leetcode.com/problems/combination-sum-iii/   216

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(1, k, n, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int k, int n, List<List<Integer>> ans, List<Integer> combo){
        if(n == 0 && k == 0){
            ans.add(new ArrayList<>(combo));
            return;
        }
        if(n < 0 || k < 0){  //k < 0 for improving performance. To cancel out checking invalid reacursions early on
            return;
        }

        for(int i = index; i <= 9; i++){
            combo.add(i);
            findCombinations(i + 1, k - 1, n - i, ans, combo);
            combo.remove(combo.size() - 1);
        }
    }
}
