import java.util.*;

public class leet456_2 {
    public static void main(String[] args) {
        String[] words = {"f","cfe","feab","fcc","cdfda","fcec","afae","cdeb","dc","bffd","edabe"};
        int n = words.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            // Create the modified array by excluding the element at index i
            ArrayList<String> modifiedWords = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    modifiedWords.add(words[j]);
                }
            }
            int maxPrefix = 0;
            // Check all adjacent pairs in the modified array
            for (int j = 0; j < modifiedWords.size() - 1; j++) {
                String s1 = modifiedWords.get(j);
                String s2 = modifiedWords.get(j + 1);
                int minLen = Math.min(s1.length(), s2.length());
                int currentPrefix = 0;
                // Find the longest common prefix between s1 and s2
                for (int k = 0; k < minLen; k++) {
                    if (s1.charAt(k) == s2.charAt(k)) {
                        currentPrefix++;
                    } else {
                        break;
                    }
                }
                if (currentPrefix > maxPrefix) {
                    maxPrefix = currentPrefix;
                }
            }
            answer[i] = maxPrefix;
        }
        System.out.println(Arrays.toString(answer));
    }
}