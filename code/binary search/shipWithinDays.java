// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/   1011

public class shipWithinDays {
    public static void main(String[] args) {
        int[] weights ={1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }

    static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum = sum + weights[i];
            max = Math.max(weights[i], max);
        }

        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(findDays(weights, mid) > days){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return start; 
    }

    static int findDays(int[] arr, int mid){
        int n = arr.length;
        int load = 0;
        int days = 1;
        for(int i = 0; i < n; i++){
            if(load + arr[i] > mid){
                days++;
                load = arr[i];
            } else{
                load = load + arr[i];
            }
        }
        return days;
    }
}
