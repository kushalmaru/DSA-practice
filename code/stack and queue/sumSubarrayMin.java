// https://leetcode.com/problems/sum-of-subarray-minimums/   907

import java.util.Stack;

public class sumSubarrayMin {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int ans = sumSubarrayMins(arr);
        System.out.println(ans);
    }

    private final static int mod = 1000000007;
    static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long res = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        long[] pse = new long[n];
        long[] nse = new long[n];

        for(int i = 0; i < n; i++){
            while(!s1.isEmpty() && arr[s1.peek()] > arr[i]){
                s1.pop();
            }
            pse[i] = s1.isEmpty() ? i + 1 : i - s1.peek();
            s1.push(i);
        }

        for(int i = n - 1; i >= 0; i--){
            while(!s2.isEmpty() && arr[s2.peek()] >= arr[i]){
                s2.pop();
            }
            nse[i] = s2.isEmpty() ? n - i : s2.peek() - i;
            s2.push(i);
        }

        for(int i = 0; i < n; i++){
            res = (res + pse[i] * nse[i] * arr[i]) % mod;
        }
        return (int) res;
    }
}
