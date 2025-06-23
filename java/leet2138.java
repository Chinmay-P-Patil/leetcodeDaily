import java.util.*;

public class leet2138 {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';

        
        int size = s.length() / k;
        int x = s.length() % k;
        String[] op = (x == 0) ? new String[size] : new String[size + 1];

        int j = 0;
        for (int i = 0; i < op.length; i++) {
            StringBuilder sb = new StringBuilder();
            int l = k;
            
            while (j < s.length() && l > 0) {
                sb.append(s.charAt(j));
                j++;
                l--;
            }
            
            while (l > 0) {
                sb.append(fill);
                l--;
            }
            
            op[i] = sb.toString();
            System.out.println("Group " + (i + 1) + ": " + op[i]);
        }

        System.out.println("Final output: " + Arrays.toString(op));
    }
}
