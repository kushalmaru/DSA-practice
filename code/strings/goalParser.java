// https://leetcode.com/problems/goal-parser-interpretation/  1678

public class goalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        interpret(command);
    }

    static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    // static String interpret(String command) {
    //     char arr[]=command.toCharArray();
    //     StringBuilder sb=new StringBuilder();
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]=='G'){
    //             sb.append("G");
    //         }
    //         if(arr[i]=='(' && arr[i+1]==')'){
    //             sb.append("o");
    //         }
    //         if(arr[i]=='(' && arr[i+1]=='a'){
    //             sb.append("al");
    //         }
    //     }
    //     return sb.toString();
    // }
}
