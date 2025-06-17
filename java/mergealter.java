//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

//Return the merged string.

 

//Example 1:

//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
import java.util.*;
public class mergealter {
    public static void main(String[] args){
        String word1 = "abc", word2 = "pqr";
        int l1 = word1.length();
        int l2 = word2.length();
        char[] merged = new char[l1 + l2];
        
        int i = 0, j = 0, k = 0;
        
        while (i < l1 || j < l2) {
            if (i < l1) {
                merged[k++] = word1.charAt(i++);
            }
            if (j < l2) {
                merged[k++] = word2.charAt(j++);
            }
        }
        
        System.out.println(new String(merged));
    }
}
