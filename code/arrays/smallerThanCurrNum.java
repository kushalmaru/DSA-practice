// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/   1365

import java.util.Arrays;

public class smallerThanCurrNum {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans)); 
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] && j != i){
                    count++;
                }
                output[i] = count;
            }
        }
        return output;
    }
}
