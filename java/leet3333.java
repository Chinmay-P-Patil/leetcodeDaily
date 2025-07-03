import java.util.*;

public class leet3333 {
    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Example test cases
        String word1 = "aabbccdd";
        int k1 = 7;
        System.out.println(numberOfWays(word1, k1)); // Output: 5

        String word2 = "aabbccdd";
        int k2 = 8;
        System.out.println(numberOfWays(word2, k2)); // Output: 1

        String word3 = "aaabbb";
        int k3 = 3;
        System.out.println(numberOfWays(word3, k3)); // Output: 8
    }

    public static int numberOfWays(String word, int k) {
        if (k > word.length()) {
            return 0; // No valid strings if k is greater than word length
        }
        
        List<Integer> runs = new ArrayList<>();
        int consecutive = 1;

        // Step 1: Identify sequences of consecutive identical characters
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                consecutive++;
            } else {
                runs.add(consecutive);
                consecutive = 1;
            }
        }
        runs.add(consecutive);

        // Step 2: Calculate total ways and valid ways considering k
        long count = 1;
        int totalLength = word.length();
        int maxReductions = totalLength - k;

        // If k equals word length, only one string is possible
        if (k == totalLength) {
            for (int len : runs) {
                count = (count * len) % MOD;
            }
            return (int) count;
        }

        // Step 3: Use inclusion-exclusion to exclude strings with length < k
        long invalid = 0;
        for (int r = 1; r <= maxReductions; r++) {
            long ways = countWaysWithReduction(runs, r);
            // Inclusion-exclusion: add for odd r, subtract for even r
            if (r % 2 == 1) {
                invalid = (invalid + ways) % MOD;
            } else {
                invalid = (invalid - ways + MOD) % MOD;
            }
        }

        // Step 4: Calculate total ways without length constraint
        for (int len : runs) {
            count = (count * len) % MOD;
        }

        // Step 5: Total valid ways = total - invalid
        long result = (count - invalid + MOD) % MOD;
        return (int) result;
    }

    // Helper method to count ways to reduce sequences by exactly r characters
    private static long countWaysWithReduction(List<Integer> runs, int r) {
        long result = 1;
        for (int len : runs) {
            // For each sequence, count ways to remove characters to contribute to r
            long ways = 0;
            for (int keep = 1; keep <= len; keep++) {
                int removed = len - keep;
                if (removed == r) {
                    ways = (ways + 1) % MOD;
                }
            }
            result = (result * ways) % MOD;
        }
        return result;
    }
}
