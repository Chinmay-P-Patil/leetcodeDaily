import java.util.*;

public class leet2040 {
    public static void main(String[] args){
        int[] nums1 = {2,5}, nums2 = {3,4};

        long k =1;

        Queue<Long> numbers = new PriorityQueue<Long>();

        for(int i = 0; i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                long n = (long) nums1[i]*nums2[j];
                numbers.offer(n);
            }
        }
        for(int i =0;i<k-1;i++){
            numbers.poll();
        }
        System.out.println(numbers.poll());
    }
}
