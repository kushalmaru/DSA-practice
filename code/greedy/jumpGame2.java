// https://leetcode.com/problems/jump-game-ii/   45

public class jumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int ans = jump(nums);
        System.out.println(ans);
    }

    static int jump(int[] nums) {
        int jumps = 0;
        int left = 0;
        int right = 0;
        int maxIndex = 0;
        while(right < nums.length - 1){
            for(int i = left; i <= right; i++){
                maxIndex = Math.max(maxIndex, i + nums[i]);
            }
            left = right + 1;
            right = maxIndex;
            jumps++;
        }
        return jumps;
    }
}
