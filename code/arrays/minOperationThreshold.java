// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/  3065

public class minOperationThreshold {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        int ans = minOperations(nums, k);
        System.out.println(ans);
    }

    static int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                count++;
            }
        }
        return count;
    }
}
