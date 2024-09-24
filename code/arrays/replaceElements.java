// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/   1299

import java.util.Arrays;

public class replaceElements {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] ans = replaceElements(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] replaceElements(int[] arr) {
        int curr_greater = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = curr_greater;
            curr_greater = Math.max(curr_greater, temp);
        }
        return arr;
    }
}
