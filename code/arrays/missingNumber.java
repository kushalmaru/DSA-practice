// https://leetcode.com/problems/missing-number/   268

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    // static int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int total_sum = (n * (n + 1)) / 2;
    //     int sum = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         sum = sum + nums[i];
    //     }
    //     return total_sum - sum;
    // }

    static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < nums.length; i++){
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }
        return xor1 ^ xor2;
    }
}
