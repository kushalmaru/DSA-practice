// https://leetcode.com/problems/fruit-into-baskets/   904

import java.util.*;

public class totalFruit {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        int ans = totalFruit(fruits);
        System.out.println(ans);
    }

    static int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxCount = 0;

        Map<Integer, Integer> mpp = new HashMap<>();
        for(right = 0; right < fruits.length; right++){
            int currFruit = mpp.getOrDefault(fruits[right], 0);
            mpp.put(fruits[right], currFruit + 1);

            while(mpp.size() > 2){
                int fruitCount = mpp.get(fruits[left]);
                if(fruitCount == 1){
                    mpp.remove(fruits[left]);
                } else{
                    mpp.put(fruits[left], fruitCount - 1);
                }
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}
