import java.util.*;
public class frequencyOfElem {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,4,2,1};
		int n = arr.length;
		// int ans = count(arr, n);
		// System.out.println(ans);
        countUsingMap(arr, n);
    }

    static int count(int[] arr, int n){
	    int count = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] == n){
	            count++;
	        }
	    }
	    return count;
	}


    static void countUsingMap(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
