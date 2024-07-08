// https://leetcode.com/problems/find-common-elements-between-two-arrays/    2956
import java.util.Arrays;

public class commanEleBetween2Arr {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};
        int[] ans = findIntersectionValues(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0;
        int ans2 = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    ans1++;
                    break;
                }
            }
        }

        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    ans2++;
                    break;
                }
            }
        }
        return new int[] {ans1, ans2};
    }
}
