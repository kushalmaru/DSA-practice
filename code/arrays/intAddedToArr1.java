// https://leetcode.com/problems/find-the-integer-added-to-array-i/     3131

import java.util.Arrays;

public class intAddedToArr1 {
    public static void main(String[] args) {
        int[] nums1 = {2,6,4};
        int[] nums2 = {9,7,5};
        int ans = addedInteger(nums1, nums2);
        System.out.println(ans);
    }

    // static int addedInteger(int[] nums1, int[] nums2) {
    //     int sum1 = 0;
    //     for(int i = 0; i < nums1.length; i++){
    //         sum1 = sum1 + nums1[i];
    //     }

    //     int sum2 = 0;
    //     for(int i = 0; i < nums2.length; i++){
    //         sum2 = sum2 + nums2[i];
    //     }
    //     return (sum2 - sum1) / nums2.length;
    // }

    static int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}
