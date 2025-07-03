import java.util.*;

public class leet169 {
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length/2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
           
        }
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
           if(map.get(key) > n){
            System.out.println(key);
           }
        }
    }
}
