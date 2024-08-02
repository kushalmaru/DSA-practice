// https://leetcode.com/problems/jump-game/   55

public class canJump {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }

    // APPROACH 1
    // static boolean canJump(int[] nums) {
    //     int maxIndex = 0;

    //     for(int i = 0; i < nums.length; i++){
    //         if(maxIndex < i){
    //             return false;
    //         }
    //         maxIndex = Math.max(maxIndex, i + nums[i]);
    //         if(maxIndex >= nums.length - 1){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // APPROACH 2
    static boolean canJump(int[] nums) {
        int finalIndex = nums.length - 1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= finalIndex){
                finalIndex = i;
            }
        }
        return finalIndex == 0;
    }
}
