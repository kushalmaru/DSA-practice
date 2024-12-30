// https://leetcode.com/problems/combination-sum/   39

import java.util.*;

public class combinationSum {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());  //this is how we call/declare new arraylist directly
        return ans;
    }

    static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> combo){  //this is how we call/declare new arraylist directly
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(combo));
            }
            return;
        }

        if(candidates[index] <= target){
            combo.add(candidates[index]);
            findCombinations(index, candidates, target - candidates[index], ans, combo);

            combo.remove(combo.size() - 1);
        }
        findCombinations(index + 1, candidates, target, ans, combo);  //outside if block we want to skip the current candidate entirely, regardless of whether it could contribute to the target.
    }
}
