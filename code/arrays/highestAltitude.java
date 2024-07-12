// https://leetcode.com/problems/find-the-highest-altitude/   1732

public class highestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        int sum = 0;
        arr[0] = 0;
        for(int i = 0; i < gain.length; i++){
            sum = sum + gain[i];
            arr[i + 1] = sum; 
        }
        int max = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        return max;
    }
}
