import java.util.*;

public class leet2311 {
    public static void main(String[] args){
        String s  = "1001010"; 
        int k = 5;
        //just keep the last one and remove all one 
        //but the decimal degit should also be < then k
        //and also it should be longest subsequence 
        //So for example where s = 00101 and k = 5
        //removing all frst ones and keeping laast one is not correct 
        //because 00101 is already = 5 which <= k

        //So traverse from right tile number <= k
        //and onese the number is > k remove all ones from that positon towrds left 

        int n = s.length();
        // Step-1: Keep all set bits until value exceeds k
        long val = 0;
        int i = 0;
        while (i < Math.min(n, 32)) { // 32 because 
            // 1 <= s.length <= 1000
            // s[i] is either '0' or '1'.
            // 1 <= k <= 109
            if (s.charAt(n - i - 1) == '1') {
                long power = (long) Math.pow(2, i);
                if (val + power > k) {
                    break;
                }
                val += power;
            }
            i++;
        }
        // Step-2: Count the removed bits
        int removed_one = 0;
        while (i < n) {
            if (s.charAt(n - i - 1) == '1') {
                removed_one++;
            }
            i++;
        }
        System.err.println(n - removed_one);
    }
}
