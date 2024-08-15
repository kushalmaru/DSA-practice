// https://leetcode.com/problems/merge-sorted-array/   88

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int n = 3, m = 3;
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int main = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[main] = nums1[i];
                i--;
                main--;
            } else{
                nums1[main] = nums2[j];
                j--;
                main--;
            }
        }
        while(j >= 0){
            nums1[main] = nums2[j];
            j--;
            main--;
        }
    }
}
