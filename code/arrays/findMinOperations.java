// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/   3190

public class findMinOperations {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int ans = minimumOperations(nums);
        System.out.println(ans);
    }
    
    
    static int minimumOperations(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] % 3 != 0){
                    count++;
                }
            }
            return count;
        }
    
}
