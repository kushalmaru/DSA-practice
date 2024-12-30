// https://leetcode.com/problems/unique-number-of-occurrences/   1207


import java.util.*;

public class uniqueOccurrences {
    public static void main(String[] args) {
        
    }

    static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int value = mp.getOrDefault(arr[i], 0);
            mp.put(arr[i], value + 1);
        }

        Set<Integer> st = new HashSet<>();
        for(int i : mp.values()){  //use enhanced for loop instead of normal for loop to easily access "value" from key-value pair in hashmap. and also helps to use st.add() function
            st.add(i);
        }
        return st.size() == mp.size();
    }
}
