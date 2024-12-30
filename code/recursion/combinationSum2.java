// https://leetcode.com/problems/combination-sum-ii/   40

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> combo){
        if(target == 0){
            ans.add(new ArrayList<>(combo));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i - 1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }

            combo.add(candidates[i]);
            findCombinations(i + 1, candidates, target - candidates[i], ans, combo);
            combo.remove(combo.size() - 1);
        }
    }
}
