import java.util.*;

public class leet350 {
    
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};

        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }else{
                map.put(nums1[i], 1);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); 
            }
        }
        
        int[] op = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            op[i] = resultList.get(i);
        }


        System.err.println(Arrays.toString(op));


        System.out.println(map);
    }
}
