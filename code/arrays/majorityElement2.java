// https://leetcode.com/problems/majority-element-ii/   229

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] nums = {11, 33, 33, 11, 33, 11};
        System.out.println(majorityElement(nums));
    }

    static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0; 
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(count1 == 0 && nums[i] != elem2){
                elem1 = nums[i];
                count1 = 1;
            } else if(count2 == 0 && nums[i] != elem1){
                elem2 = nums[i];
                count2 = 1;
            } else if(nums[i] == elem1){
                count1++;
            } else if(nums[i] == elem2){
                count2++;
            } else{
                count1--;
                count2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == elem1){
                cnt1++;
            } else if(nums[i] == elem2){
                cnt2++;
            }
        }

        int min = (int) (n / 3);
        if(cnt1 > min){
            list.add(elem1);
        } if(cnt2 > min){
            list.add(elem2);
        }
        return list;
    }
}
