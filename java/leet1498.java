import java.util.*;

public class leet1498{
    static int MOD = (int)1e9 + 7;
    
    private static void precomputePowerOfTwo(int[] powerOfTwo, int n) {
        powerOfTwo[0] = 1;
        for (int i = 1; i < n; ++i) {
            powerOfTwo[i] = (int)((powerOfTwo[i - 1] * 2L) % MOD);
        }
    }
    
    public static int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int[] powerOfTwo = new int[n];
        precomputePowerOfTwo(powerOfTwo, n);
        
        Arrays.sort(nums);
        int subsequences = 0;
        
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                subsequences = (subsequences + powerOfTwo[right - left]) % MOD;
                left++;
            }
        }
        return subsequences;
    }

    public static void main(String[] args){
        int[] nums = {2,3,3,4,6,7};
        int target = 12;

        System.out.println(numSubseq(nums, target));
    }
}