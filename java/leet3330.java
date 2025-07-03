import java.util.*;

public class leet3330 {
    public static void main(String[] args){
        String word = "aabbccdd";

        
        
        int count = 1; // The original word is always a possibility
        int consecutive = 1; // Length of current consecutive character sequence
        if (word.length() <= 1){
            System.out.println(count);
        } 
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                consecutive++;
            } else {
                if (consecutive > 1) {
                    count += consecutive - 1;
                }
                consecutive = 1;
            }
        }
        
        // Add the last sequence if it has duplicates
        if (consecutive > 1) {
            count += consecutive - 1;
        }
        
        System.out.println(count);
    }
}
