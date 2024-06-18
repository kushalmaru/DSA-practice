
public class secondLargestAndMin {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};      
        int sl = secondLargest(arr);
        int ss = secondSmallest(arr);
        System.out.println(sl);
        System.out.println(ss);
    }


    static int secondLargest(int[] arr){
         int largest = arr[0];
         int slarget = -1;
         
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > largest) {
                slarget = largest;
                largest = arr[i];
             }
             else if (arr[i] < largest && arr[i] > slarget) {
                slarget = arr[i];
             }
         }
         return slarget;
    }

    static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int ssmallest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
}