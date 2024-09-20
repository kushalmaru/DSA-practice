// https://leetcode.com/problems/max-consecutive-ones-iii/   1004

public class longestOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = longestOnes(nums, k);
        System.out.println(ans);
    }

    static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int numOfZeros = 0;

        for(right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                numOfZeros++;
            }
            if(numOfZeros > k){
                if(nums[left] == 0){
                    numOfZeros--;
                }
                left++;
            }
        }
        return right - left;
    }
}
