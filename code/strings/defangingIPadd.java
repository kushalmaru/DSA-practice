// https://leetcode.com/problems/defanging-an-ip-address/  1108
public class defangingIPadd {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
    }
    

    // static String defangIPaddr(String address) {
    //     String abc = address.replace(".", "[.]");
    //     return abc;
    // }

    static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
            for(int i = 0; i < address.length(); i++){
                if(address.charAt(i) == '.'){
                    sb.append("[.]");
                }
                else{
                    sb.append(address.charAt(i));
                }
            }
            return sb.toString();
        }

}
