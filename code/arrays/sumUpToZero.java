// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/   1304

import java.util.Arrays;

public class sumUpToZero {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = sumZero(n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n % 2 == 0){
            for(int i = 0; i < n; i = i + 2){
                ans[i] = i + 1;
                ans[i + 1] = -(i + 1);
            } 
        } else {
                ans[0] = 0;
                for(int i = 1; i < n; i = i + 2){
                ans[i] = i + 1;
                ans[i + 1] = -(i + 1);
            }
            }
        return ans;
    }
}
