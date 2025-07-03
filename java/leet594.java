import java.util.*;

public class leet594 {
    public static void main(String[] args){
        //int[] nums = {1, 2, 2, 2, 3, 3, 3, 3, 4, 4};
        int[] nums = {1, 5, 2, 10, 1, 2, 6, 7, 2};

        int size = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i]+1)){
                int count = map.get(nums[i]) + map.get(nums[i] +1);
                if(count > size){
                    size = count;
                }
            }
        }

        



        System.out.println(map);
        System.out.println(size);
    }
}
