// https://leetcode.com/problems/sum-of-subarray-ranges/   2104

import java.util.Stack;

public class subArrayRanges {
    public static void main(String[] args) {
        int[] nums = {1,3,3};
        long ans = subArrayRanges(nums);
        System.out.println(ans);
    }

    static long subArrayRanges(int[] nums) {
        return sumSubarrayMax(nums) - sumSubarrayMins(nums);
    }

    static long sumSubarrayMins(int[] arr) {
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
            res = (res + pse[i] * nse[i] * arr[i]);
        }
        return res;
    }



    static long sumSubarrayMax(int[] arr) {
        int n = arr.length;
        long res = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        long[] pge = new long[n];
        long[] nge = new long[n];

        for(int i = 0; i < n; i++){
            while(!s1.isEmpty() && arr[s1.peek()] < arr[i]){
                s1.pop();
            }
            pge[i] = s1.isEmpty() ? i + 1 : i - s1.peek();
            s1.push(i);
        }

        for(int i = n - 1; i >= 0; i--){
            while(!s2.isEmpty() && arr[s2.peek()] <= arr[i]){
                s2.pop();
            }
            nge[i] = s2.isEmpty() ? n - i : s2.peek() - i;
            s2.push(i);
        }

        for(int i = 0; i < n; i++){
            res = (res + pge[i] * nge[i] * arr[i]);
        }
        return res;
    }
}
