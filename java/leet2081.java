import java.util.*;

public class leet2081 {
    public static void main(String[] args) {
        int k = 5, n = 20;
        System.out.println(kMirror(k, n));
    }

    public static long kMirror(int k, int n) {
        List<Long> list = new ArrayList<>();
        long sum = 0;
        
        // Single-digit palindromes
        for (long i = 1; i <= 9 && list.size() < n; i++) {
            if (isPalindromeInBaseK(i, k)) {
                list.add(i);
                sum += i;
            }
        }
        
        // Generate longer palindromes
            // Generate palindromes of length = digits
        for (int digits = 2; list.size() < n; digits++) {
            long end = (long)Math.pow(10, (digits+1)/2);
            long start = (long)Math.pow(10, (digits-1)/2);
            
            for (long base = start; base < end && list.size() < n; base++) {
                // Construct palindrome by mirroring
                long palindrome = base;
                long temp = (digits % 2 == 1) ? base / 10 : base;
                while (temp > 0) {
                    palindrome = palindrome * 10 + (temp % 10);
                    temp /= 10;
                }
                
                // Check base-k palindrome
                if (isPalindromeInBaseK(palindrome, k)) {
                    list.add(palindrome);
                    sum += palindrome;
                }
            }
        }
        return sum;
    }

    private static boolean isPalindromeInBaseK(long num, int base) {
        // Convert to base-k and check palindrome
        String baseK = toBaseKString(num, base);
        int left = 0, right = baseK.length() - 1;
        while (left < right) {
            if (baseK.charAt(left++) != baseK.charAt(right--)) 
                return false;
        }
        return true;
    }

    private static String toBaseKString(long num, int radix) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % radix);
            num /= radix;
        }
        return sb.reverse().toString();
    }
}


// import java.util.*;

// public class leet2081 {
//     public static void main(String[] args) {
//         int k = 5, n = 20, count = 0;
//         long sum = 0;

//         ArrayList<Long> baseten = new ArrayList<>();

//         for (long i = 1; count < n; i++) {
//             if (ispalindrome(i)) {
//                 if (basek(i, k)) {
//                     count++;
//                     baseten.add(i);
//                     sum += i;
//                 }
//             }
//         }
//         System.out.println(sum);
//     }

//     private static boolean basek(long i, int k) {
//         StringBuilder sb = new StringBuilder();
//         while (i > 0) {
//             sb.append(i % k);
//             i /= k;
//         }
//         String baseKStr = sb.reverse().toString();
//         if (baseKStr.isEmpty()) return false; // Handle edge case
//         String revBaseKStr = new StringBuilder(baseKStr).reverse().toString();
//         return baseKStr.equals(revBaseKStr);
//     }

//     private static boolean ispalindrome(long i) {
//         if (i < 0) return false; // Negative numbers are not palindromes
//         String str = String.valueOf(i);
//         String revStr = new StringBuilder(str).reverse().toString();
//         return str.equals(revStr);
//     }
// }


