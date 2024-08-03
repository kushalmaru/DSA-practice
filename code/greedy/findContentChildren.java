// https://leetcode.com/problems/assign-cookies/   455

import java.util.Arrays;

public class findContentChildren {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int ans = findContentChildren(g, s);
        System.out.println(ans);
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(s[j] >= g[i]){
                i = i + 1;
            }
            j = j + 1;
        }
        return i;
    }
}
