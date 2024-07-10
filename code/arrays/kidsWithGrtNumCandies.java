// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/   1431

import java.util.ArrayList;
import java.util.List;

public class kidsWithGrtNumCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> soln = new ArrayList<>(kidsWithCandies(candies, extraCandies));
        System.out.println(soln);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
    
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
