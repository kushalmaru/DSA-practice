// https://leetcode.com/problems/trapping-rain-water/   42

public class trappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = trap(height);
        System.out.println(ans);
    }

    static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                } else{
                    res = res + (leftMax - height[left]);
                }
                left++;
            } else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                } else{
                    res = res + (rightMax - height[right]);
                }
                right--;
            }
        }
        return res;
    }
}
