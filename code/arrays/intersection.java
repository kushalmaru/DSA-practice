import java.util.ArrayList;

public class intersection {
 public static void main(String[] args) {
    int arr1[]= {1,2,3,3,4,5,6,7};
    int arr2[]= {3,3,4,4,5,8};

    ArrayList<Integer> ans= intersectionOfArrays(arr1, arr2);
  
     for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i)+" ");
    }
}
 

 static ArrayList<Integer> intersectionOfArrays(int[] arr1, int[] arr2){
    ArrayList<Integer> intersection =new ArrayList<>();
    
    int i = 0, j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            i++;
        }else if (arr2[j] < arr1[i]){
            j++;
        } else{
            intersection.add(arr1[i]);
            i++;
            j++;
        }
    }
    return intersection;
 }
}

