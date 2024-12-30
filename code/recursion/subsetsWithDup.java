// https://leetcode.com/problems/subsets-ii/   90

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findCombinations(0, nums, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] nums, List<List<Integer>> ans, List<Integer> combo){
        ans.add(new ArrayList<>(combo));  // Here we are not explicitly giving base condition to return because for loop does it for us
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i - 1]) continue;
            combo.add(nums[i]);
            findCombinations(i + 1, nums, ans, combo);
            combo.remove(combo.size() - 1);
        }
    }
}
