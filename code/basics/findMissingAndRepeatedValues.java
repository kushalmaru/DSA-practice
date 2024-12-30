// https://leetcode.com/problems/find-missing-and-repeated-values/  2965

public class findMissingAndRepeatedValues {
    public static void main(String[] args) {
        
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        int[] nums = new int[size];
        int index = 0;
        for(int[] row : grid){
            for(int elem : row){
                nums[index++] = elem; 
            }
        }

        int i = 0;
        while(i < size){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        int[] result = new int[2];
        for(int j = 0; j < size; j++){
            if(nums[j] != j + 1){
                result[0] = nums[j];
                result[1] = j + 1;
                break;
            }
        }
        return result;
    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
