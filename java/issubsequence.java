import java.util.*;

public class issubsequence {
    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";

        int i = 0; // Pointer for s
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            }
        }
        if (i == s.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}