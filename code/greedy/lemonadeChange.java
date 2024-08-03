// https://leetcode.com/problems/lemonade-change/   860

public class lemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        boolean ans = lemonadeChange(bills);
        System.out.println(ans);
    }

    static boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                count5++;
            }
            else if(bills[i] == 10){
                if(count5 > 0){
                    count10++;
                    count5--;
                } else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(count10 > 0 && count5 > 0){
                    count10--;
                    count5--;
                } else if(count5 >= 3){
                    count5 = count5 - 3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
