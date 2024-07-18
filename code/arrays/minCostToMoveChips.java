// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/   1217

public class minCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {1,2,3};
        int ans = minCostToMoveChips(position);
        System.out.println(ans);

    }

    static int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}
