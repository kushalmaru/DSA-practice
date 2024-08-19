// https://leetcode.com/problems/maximum-product-subarray/   152

public class maxProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    static int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i = 0; i < n; i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix *= (double)nums[i];
            suffix *= (double)nums[n - i - 1];
            ans = (int)Math.max(ans, Math.max(prefix, suffix));
            
            
        }
        return ans;
    }
}
