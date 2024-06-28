public class primeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(12));
    }

    static boolean primeNumber(int n){
        int c = 2;
        if(n <= 2){
            return false;
        }
        while (c * c < n) {
            if(n % 2 == 0){
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        return false;
    }
}
