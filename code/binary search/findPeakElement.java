// https://leetcode.com/problems/find-peak-element/   162

public class findPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //you are in the descending part of the array
                //this may be the ans, but look at left
                //this is why end =! -1
                end = mid;
            }
            //you are in the ascending part of the array
            else {
                start = mid + 1;//because we know that mid+1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largest no. because of above 2 checks
        return start; //we can return start or end, as both are equal
    }
}
