// https://leetcode.com/problems/magnetic-force-between-two-balls/   1552

import java.util.Arrays;

public class maxDistanceBetweenBalls {
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = maxDistance(stalls, k);
        System.out.println(ans);
    }

    static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int start = 1;
        int end = (position[n - 1] - position[0]);
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(canWePlace(position, mid, m) == true){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return end;
    }

    static boolean canWePlace(int[] arr, int mid, int balls){
        int n = arr.length;
        int countBalls = 1;
        int last = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] - last >= mid){
                countBalls++;
                last = arr[i];
            }
            if(countBalls >= balls){
                return true;
            }
        }
        return false;
    }
}
