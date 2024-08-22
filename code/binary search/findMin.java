// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/   153

public class findMin {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    static int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start);
            if(nums[start] <= nums[mid]){
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            } else{
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}
