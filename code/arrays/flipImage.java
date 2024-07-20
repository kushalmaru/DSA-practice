// https://leetcode.com/problems/flipping-an-image/   832

import java.util.Arrays;

public class flipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int j = 0;
            int k = image.length - 1;
            while(j < k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
        }

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
