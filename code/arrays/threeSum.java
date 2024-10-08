// https://leetcode.com/problems/3sum/   15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                } else if(sum > 0){
                    k--;
                } else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    // while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return res;
    }
}
