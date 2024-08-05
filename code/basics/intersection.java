// https://leetcode.com/problems/intersection-of-two-arrays/   349

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int n2 : nums2){
            set.add(n2);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n1 : nums1){
            if(set.contains(n1)){
                list.add(n1);
                set.remove(n1);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
