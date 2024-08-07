// https://leetcode.com/problems/rearrange-array-elements-by-sign/   2149

import java.util.Arrays;

public class rearrangeArray {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int positiveIndex = 0;
        int negativeIndex = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] <= 0){
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            } else{
                ans[positiveIndex] = nums[i];
                positiveIndex += 2;
            }
        }
        return ans;
    }
}
