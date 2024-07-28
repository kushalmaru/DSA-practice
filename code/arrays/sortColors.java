// https://leetcode.com/problems/sort-colors/   75

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[mid] == 0){
                swap(nums,low, mid);
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            // if(mid > high){
            //     break;
            // }
        }
    }

    static void swap(int[] nums, int elem1, int elem2){
        int temp = nums[elem1];
        nums[elem1] = nums[elem2];
        nums[elem2] = temp;
    }
}
