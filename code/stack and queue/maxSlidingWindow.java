// https://leetcode.com/problems/sliding-window-maximum/   239

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class maxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int resi = 0;

        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(!q.isEmpty() && q.peek() == i - k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k - 1){
                res[resi++] = nums[q.peek()];
            }
        }
        return res;
    }
}
