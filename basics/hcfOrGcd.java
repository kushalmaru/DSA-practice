
public class hcfOrGcd {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;
        System.out.println(hcf(n1, n2));
    }

    static int hcf(int n1, int n2){
        int gcdNum = 1;
        for(int i = 1; i <= Math.min(n1, n2); i++){
            if (n1 % i == 0 && n2 % i == 0) {
                gcdNum = i;
            }
        }
        return gcdNum;
    }
}