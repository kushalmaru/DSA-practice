import java.util.Arrays;
public class leftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] a = rotate(arr);
        System.out.print(Arrays.toString(a));
    }

    static int[] rotate(int[] array){
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;
        return array;
    }
}
