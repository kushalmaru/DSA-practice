// https://leetcode.com/problems/koko-eating-bananas/   875

public class minEatingSpeed {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(piles, h);
        System.out.println(ans);
    }

    static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = findMax(piles);
        while(start <= end){
            int mid = start + (end - start) / 2;
            double sumOfTotalHrs = totalHours(piles, mid);
            if(sumOfTotalHrs <= h){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int findMax(int[] piles){
        int maxi = Integer.MIN_VALUE;
        for(int max : piles){
            maxi = Math.max(max, maxi);
        }
        return maxi;
    }

    static double totalHours(int[] piles, int mid){
        double totHrs = 0;
        for(int i = 0; i < piles.length; i++){
            totHrs = totHrs + Math.ceil((double) piles[i] / mid);
        }
        return totHrs;
    }
}
