// Find the Index of the First Occurrence in a String   28

public class indexOfFirstOccurance {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }

    static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        
        return -1;        
    }
}
