// https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors/   2507

public class smallestValue {
    public static void main(String[] args) {
        
    }

    static int smallestValue(int n) {
        while(true){
            int temp = n;
            int sum = 0;
            for(int i = 2; i * i <= temp; i++){
                while(temp % i == 0){
                    sum = sum + i;
                    temp = temp / i;
                }
            }
            if(temp != 1){
                sum = sum + temp;
            }

            if(sum == n){
                break;
            }
            n = sum;
        }
        return n;
    }
}
