// https://leetcode.com/problems/search-insert-position/   35

public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int tartget = 2;
        int ans = searchInsert(nums, tartget);
        System.out.println(ans);
    }

    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}
