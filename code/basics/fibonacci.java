// https://leetcode.com/problems/fibonacci-number/   509

public class fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n));
    }

    static int fib(int n) {
        // if(n <= 1){
        //     return n;
        // }
        // return fib(n-1) + fib(n-2);

        if(n <= 1){
            return n;
        }

        int[] newArr = new int[n + 1];
        newArr[0] = 0; 
        newArr[1] = 1; 

        for(int i = 2; i <= n; i++){
            newArr[i] = newArr[i - 1] + newArr[i - 2];
        }
        return newArr[n];
    }
}
