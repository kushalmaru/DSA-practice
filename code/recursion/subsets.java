// https://leetcode.com/problems/subsets/   78

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, ans, new ArrayList<>());
        return ans;
    }

    private static void findSubsets(int index, int[] nums, List<List<Integer>> ans, List<Integer> combo){
        if(index == nums.length){
            ans.add(new ArrayList<>(combo));
            return;
        }
        combo.add(nums[index]);
        findSubsets(index + 1, nums, ans, combo);
        combo.remove(combo.size() - 1);
        findSubsets(index + 1, nums, ans, combo);
    }
}
