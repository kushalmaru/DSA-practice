// https://leetcode.com/problems/maximum-population-year/   1854

public class maxPopulation {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999}, {2000,2010}};
        int ans = maximumPopulation(logs);
        System.out.println(ans);
    }

    static int maximumPopulation(int[][] logs) {
        int[] ans = new int[101];
        for(int[] log : logs){
            ans[log[0] - 1950]++;
            ans[log[1] - 1950]--;
        }
        int maxValue = ans[0];
        int maxYear = 1950;
        for(int i = 1; i < ans.length; i++){
            ans[i] += ans[i - 1];
            if(ans[i] > maxValue){
                maxValue = ans[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}
