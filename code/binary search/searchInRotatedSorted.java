// https://leetcode.com/problems/search-in-rotated-sorted-array/   33

public class searchInRotatedSorted {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[start] <= nums[mid]){   // left part sorted
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else{                                // right part sorted
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
