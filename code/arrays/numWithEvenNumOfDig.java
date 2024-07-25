// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/   1295
public class numWithEvenNumOfDig {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int numberDigits = digits(num);
         return numberDigits % 2 == 0;
     }

     static int digits(int num){

        if (num < 0){
            num = num * -1;
        }

        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
