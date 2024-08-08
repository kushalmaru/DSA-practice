// https://leetcode.com/problems/majority-element/   169

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            } else if(element == nums[i]){
                count++;
            } else{
                count--;
            }
        }
        return element;
    }
}
