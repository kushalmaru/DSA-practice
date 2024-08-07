// https://leetcode.com/problems/max-consecutive-ones/485

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; 
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max, count);
            } else{
                count = 0;
            }
        }
        return max;
    }
}
