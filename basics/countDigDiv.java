// https://leetcode.com/problems/count-the-digits-that-divide-a-number/   2520

public class countDigDiv {
    public static void main(String[] args) {
        System.out.println(countDigits(12));
    }

    static int countDigits(int num) {
        int count = 0;
        int ans = num;
        while(ans > 0){
            int rem = ans % 10;
            if(num % rem == 0){
                count++;
            }
            ans = ans / 10;
        }
        return count;
    }
}
