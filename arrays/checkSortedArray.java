package arrays;
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/  1752
public class checkSortedArray {
    
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        boolean ans = check(nums);
        System.out.println(ans);
    }
    
        static boolean check(int[] nums) {
            int n = nums.length;
            int count = 0;
    
    
            for(int i = 0; i < n-1; i++ ){ 
                if(nums[i] >= nums[i+1]){  
                    count++;
                }
            }
             
                if(nums[0] < nums[n-1]){
                    count++;
                }
                    
                return count <=1;    
            }
        
     }

