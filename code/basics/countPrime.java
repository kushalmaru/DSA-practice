// https://leetcode.com/problems/count-primes/   204

public class countPrime {
    public static void main(String[] args) {
        int n = 10;
        int ans = countPrimes(n);
        System.out.println(ans);
    }

    static int countPrimes(int n) {
        if(n == 0 || n == 1){
            return 0;
        }

        boolean[] isPrime = new boolean[n + 1];
        for(int i = 2; i <= n; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= n; i++){  // running till sqrt of n
            if(isPrime[i] == true){
                for(int j = i * i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i] == true){
                count++;
            }
        }
        return count;
    }
}
