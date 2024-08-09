// https://leetcode.com/problems/next-permutation/   31

public class nextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        
    }

    static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums,0);
        }else{
            for(int i = n - 1; i >= 0; i--){
                if(nums[i] > nums[index]){
                    swap(nums, index, i);
                    break;
                }
            }
            reverse(nums, index + 1);
        }


    }

    static void swap(int[] nums, int ele1, int ele2){
        int temp = nums[ele1];
        nums[ele1] = nums[ele2];
        nums[ele2] = temp;
    }

    static void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
