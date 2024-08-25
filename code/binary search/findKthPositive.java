// https://leetcode.com/problems/kth-missing-positive-number/   1539

public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int ans = findKthPositive(arr, k);
        System.out.println(ans);
    }

    static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int noOfMissing = arr[mid] - (mid + 1);
            if(noOfMissing < k){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return end + 1 + k;
    }
}
