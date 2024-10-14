// https://leetcode.com/problems/powx-n/   50

public class myPow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        double sol = myPow(x, n);
        System.out.println(sol);
    }

    static double myPow(double x, int n) {
        double toCovertPos = n;  // we used another var to store n because we didnt wanted to make changes in original value
        double ans = 1;
        if(toCovertPos < 0){
            toCovertPos = toCovertPos * -1; // multiplied with -1 instead of -n because of stack overflow. i.e. INTEGER_MINVALUE * -INTEGER_MINVALUE will exceed
        }                                   // Hence we first convert it into positive ans then after computation we convert back to -ve.
        while(toCovertPos > 0){
            if(toCovertPos % 2 == 1){
                ans = ans * x;
                toCovertPos--;
            } else{
                toCovertPos = toCovertPos / 2;
                x = x * x;
            }
        }
        if(n < 0){  // converts back to negative after above computation
            ans = 1 / ans;
        }
        return ans;
    }
}
