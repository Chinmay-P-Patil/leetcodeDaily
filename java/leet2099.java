import java.util.*;

public class leet2099 {
    public static void main(String[] args){
        int[] nums = {-1,-2,3,4};
        int k = 3;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Add all elements with their indices
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if (pq.size() > k) {
                pq.poll(); // Keep only k largest elements
            }
        }

        // Extract the k elements and sort by original index
        List<int[]> topK = new ArrayList<>();
        while (!pq.isEmpty()) {
            topK.add(pq.poll());
        }
        topK.sort((a, b) -> a[1] - b[1]);

        // Create result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[0];
        }

        

        
        System.out.println(Arrays.toString(result));
    }
}
