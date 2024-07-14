// https://leetcode.com/problems/robot-return-to-origin/   657

public class robotToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }

    static boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'R'){
                leftRight++;
            }
            if(moves.charAt(i) == 'L'){
                leftRight--;
            }
            if(moves.charAt(i) == 'U'){
                upDown++;
            }
            if(moves.charAt(i) == 'D'){
                upDown--;
            }
        }
        return (leftRight == 0 && upDown == 0);
    }
}
