// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/   1283

public class smallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println(ans);
    }

    static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold) return -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(nums[i], max);
        }

        int start = 1;
        int end = max;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(SumBydivisor(nums, mid) <= threshold){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int SumBydivisor(int[] nums, int div){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.ceil((double) (nums[i]) / (double) (div));
        }
        return sum;
    }
}
