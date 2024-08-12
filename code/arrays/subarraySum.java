// https://leetcode.com/problems/subarray-sum-equals-k/   560

import java.util.HashMap;

public class subarraySum {
    public static void main(String[] args) {
        int[] nums = {3, -3, 1, 1, 1};
        int k = 3;
        int ans = subarraySum(nums, k);
        System.out.println(ans);
    }

    static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int i : nums){
            preSum = preSum + i;

            int remove = preSum - k;

            count = count + map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
