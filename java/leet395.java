import java.util.*;

public class leet395 {
    public static void main(String[] args){
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4},op;

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }else{
                map.put(nums1[i], 1);
            }
        }
       
        for (int num : nums2) {
            if (map.containsKey(num)) {
                result.add(num);
            }
        }
        op = new int[result.size()];
        int i =0;
        //hasnext and next
        for (Integer num : result) {
            op[i++] = num;
        }
        


        System.out.println(map);
        System.out.println(result);
        System.out.println(Arrays.toString(op));
    }
}
