// https://leetcode.com/problems/add-to-array-form-of-integer/   989 

import java.util.LinkedList;
import java.util.List;

public class addToArrayForm {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        List ans = addToArrayForm(num, k);
        System.out.println(ans);
    }

     static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        List<Integer> ans = new LinkedList<>();
        for(int i = n - 1; i >= 0; i--){
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while(k > 0){
            ans.add(0, k % 10);
            k = k / 10;
        }
        return ans;
    }
}
