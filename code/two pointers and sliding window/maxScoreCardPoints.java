// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/   1423

public class maxScoreCardPoints {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        int ans = maxScore(cardPoints, k);
        System.out.println(ans);
    }

    static int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        int rightIndex = cardPoints.length - 1;

        for(int i = 0; i <= k - 1; i++){
            lsum = lsum + cardPoints[i];
        }
        maxsum = lsum;

        for(int i = k - 1; i >= 0; i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rightIndex];
            rightIndex--;
            maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;
    }
}
