import java.util.*;

public class leet3304 {

    public static char nextChar(char c) {
        if (c == 'z') {
            return 'a';
        }
        return (char) (c + 1);
    }
    
    public static void main(String[] args){
        int k =5;
        StringBuilder word = new StringBuilder("a");
        
        // Continue operations until the string length is at least k
        while (word.length() < k) {
            StringBuilder newString = new StringBuilder();
            // For each character in the current word, append its next character
            for (char c : word.toString().toCharArray()) {
                newString.append(c);
                newString.append(nextChar(c));
            }
            word = newString;
        }
        
        // Return the k-th character (1-based index adjusted to 0-based)
        System.out.println(word.charAt(k - 1));
    }
}
