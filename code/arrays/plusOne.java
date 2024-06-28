// https://leetcode.com/problems/plus-one/  66

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {2,3,9};
        int[] arr = plusOne(digits);
        System.out.println(Arrays.toString(arr));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9) {
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
