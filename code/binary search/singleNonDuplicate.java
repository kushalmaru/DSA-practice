// https://leetcode.com/problems/single-element-in-a-sorted-array/   540

public class singleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }

    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 1;
        int end = n - 2;
        if(n == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n - 1] != nums[n - 2]){
            return nums[n - 1];
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            else if((mid % 2 == 0 && nums[mid] == nums[mid - 1] || (mid % 2 == 1 && nums[mid] == nums[mid + 1]))){
                end = mid - 1;   // right part
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
