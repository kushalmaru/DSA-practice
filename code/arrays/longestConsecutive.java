// https://leetcode.com/problems/longest-consecutive-sequence/   128

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for(int dig : set){
            if(!set.contains(dig - 1)){
                int x = dig;
                int count = 1;

                while(set.contains(x + 1)){
                count++;
                x++;
                }
                longest = Math.max(longest, count);
            } 
        }
        return longest;
    }
}
